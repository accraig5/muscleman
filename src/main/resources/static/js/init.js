$(window).load(function() {
  $(".progressLoader").fadeOut("slow");
  $('body div').removeClass('loading');
});


$(document).ready(function() {

  //Scrolling for Navbar
  var didScroll;
  var lastScrollTop = 0;
  var delta = 5;
  var navbarHeight = $('nav').outerHeight();

  $(window).scroll(function(event) {
    //for header
    didScroll = true;
  });

  setInterval(function() {
    if (didScroll) {
      hasScrolled();
      didScroll = false;
    }
  }, 200);

  $(window).resize(function(event){
    $('header #1').addClass('nav-down');
  });

  function hasScrolled() {
    var st = $(window).scrollTop();

    // Make sure they scroll more than delta
    if (Math.abs(lastScrollTop - st) <= delta)
      return;

    // If they scrolled down and are past the navbar, add class .nav-up.
    // This is necessary so you never see what is "behind" the navbar.
    if ((st > lastScrollTop) && (st > navbarHeight)) {
      // Scroll Down
      $('nav').removeClass('nav-down').addClass('nav-up');
      setTimeout(function() {
        $('nav').addClass("nav-up");
      },10);
    } else {
      // Scroll Up
      if (st + $(window).height() < $(document).height()) {
        $('nav').removeClass('nav-up').addClass('nav-down');
        setTimeout(function() {
          $("nav").addClass("nav-down");
        },10);
      }
    }

    lastScrollTop = st;
  }

  //Character counter for email form
  $('input#subject').characterCounter();

  //Initialize Materialize functions
  (function($) {
    $(function() {

      $('.sidenav').sidenav({
        menuWidth : 200,
        closeOnClick: true,
        edge: 'left'
      });
      $('.parallax').parallax();

    });
  })(jQuery);

  //Checks if email address form is correct
  function validateEmail(email) {
      var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
      return re.test(email.toLowerCase());
  }

  //Checks if the whole email form is filled out correctly
  function checkValidation() {
    if (validateEmail($('#email').val()) && ($('#full_name').val()) && $('#subject').hasClass("valid")) {
      $('#emailform_submit').prop('disabled', false);
      $('#emailform_submit').removeClass('disabled');
    }
    else {
      $('#emailform_submit').prop('disabled', true);
      $('#emailform_submit').addClass('disabled');
    }
  }

  //Edits full name field on keypress
  $('#full_name').on('keyup', function() {
    if (($.trim(this.value).length)) {
      $('#full_name').addClass('valid');
      $('#full_name').removeClass('invalid');
    }
    else if (!$.trim(this.value).length) {
      $('#full_name').removeClass('invalid');
      $('#full_name').removeClass('valid');
    }
    else {
      $('#full_name').removeClass('valid');
      $('#full_name').addClass('invalid');
    }
    checkValidation();
  });

  //Edits email address field  on keypress
  $('#email').on('keyup', function() {
    if (validateEmail($('#email').val())) {
      $('#email').removeClass('invalid');
      $('#email').addClass('valid');
    } else if (!$.trim(this.value).length){
      $('#email').removeClass('invalid');
      $('#email').removeClass('valid');
    }
    else{
      $('#email').removeClass('valid');
      $('#email').addClass('invalid');
    }
    checkValidation();
  });

  //Edits subject field on keypress
  $('#subject').on('keyup', function() {
    if (($.trim(this.value).length) && !($('#subject').hasClass('invalid'))) {
      $('#subject').addClass('valid');
    }
    else if (!($.trim(this.value).length)) {
      $('#subject').removeClass('valid');
      $('#subject').removeClass('invalid');
    }
    else {
      $('#subject').removeClass('valid');
    }
    checkValidation();
  });

  //Redirects email submit once button is clicked
  $('#emailform_submit').click(function(event) {
    let decision = confirm('Are you sure you would like to send your Email?');
    if (decision) {
      $.post('contact.php', $('#emailform').serialize());
      window.location.href = 'contactform.php';
    }
  });

  //Finds height from top of page of object/element in DOM
  $.fn.visible = function(partial) {

    var $t = $(this),
      $w = $(window),
      viewTop = $w.scrollTop(),
      viewBottom = viewTop + $w.height(),
      _top = $t.offset().top,
      _bottom = _top + $t.height(),
      compareTop = partial === true ? _bottom : _top,
      compareBottom = partial === true ? _top : _bottom;

    return ((compareBottom <= viewBottom - 200) && (compareTop >= viewTop));

  };

  //Drop down menu
  $('.dropdown-trigger').dropdown({
    inDuration: 300,
    outDuration: 225,
    constrain_width: false, // Does not change width of dropdown to that of the activator
    hover: true, // Activate on hover
    gutter: 0, // Spacing from edge
    belowOrigin: false, // Displays dropdown below the button
    coverTrigger: false,
    alignment: 'left' // Displays dropdown with edge aligned to the left of button
  });

  $('.dropdown-button').dropdown({
    inDuration: 300,
    outDuration: 225,
    constrain_width: false, // Does not change width of dropdown to that of the activator
    gutter: 0, // Spacing from edge
    belowOrigin: false, // Displays dropdown below the button
    coverTrigger: false,
    alignment: 'left' // Displays dropdown with edge aligned to the left of button
  });

  //Adds hover animation for PMD About Button
  $('#aboutPMDBtn').hover(function() {
    $(this).addClass('pulse');
  }, function() {
    $(this).removeClass('pulse');
  });

  //Scrolls to about PMD
  $('#scrollbtn1').click(function(event) {
    var n = $("#scrollabout").offset().top;
    $('html, body').animate({
      scrollTop: n + 1
    }, 1000);
  });
  $('#scrollbtn2').click(function(event) {
    var n = $(".currentproj").offset().top;
    $('html, body').animate({
      scrollTop: n + 1
    }, 1000);
  });



  var win = $(window);
  var allMods = $(".animate");

  allMods.each(function(i, el) {
    var el = $(el);
    if (el.visible(true)) {
      el.addClass("already-visible");
    }
  });

  win.scroll(function(event) {

    allMods.each(function(i, el) {
      var el = $(el);
      if (el.visible(true)) {
        el.addClass("come-in");
      }
    });

  });

  var initPhotoSwipeFromDOM = function(gallerySelector) {

      // parse slide data (url, title, size ...) from DOM elements
      // (children of gallerySelector)
      var parseThumbnailElements = function(el) {
          var thumbElements = el.childNodes,
              numNodes = thumbElements.length,
              items = [],
              figureEl,
              linkEl,
              size,
              item;

          for(var i = 0; i < numNodes; i++) {

              figureEl = thumbElements[i]; // <figure> element

              // include only element nodes
              if(figureEl.nodeType !== 1) {
                  continue;
              }

              linkEl = figureEl.children[0]; // <a> element

              size = linkEl.getAttribute('data-size').split('x');

              // create slide object
              item = {
                  src: linkEl.getAttribute('href'),
                  w: parseInt(size[0], 10),
                  h: parseInt(size[1], 10)
              };



              if(figureEl.children.length > 1) {
                  // <figcaption> content
                  item.title = figureEl.children[1].innerHTML;
              }

              if(linkEl.children.length > 0) {
                  // <img> thumbnail element, retrieving thumbnail url
                  item.msrc = linkEl.children[0].getAttribute('src');
              }

              item.el = figureEl; // save link to element for getThumbBoundsFn
              items.push(item);
          }

          return items;
      };

      // find nearest parent element
      var closest = function closest(el, fn) {
          return el && ( fn(el) ? el : closest(el.parentNode, fn) );
      };

      // triggers when user clicks on thumbnail
      var onThumbnailsClick = function(e) {
          e = e || window.event;
          e.preventDefault ? e.preventDefault() : e.returnValue = false;

          var eTarget = e.target || e.srcElement;

          // find root element of slide
          var clickedListItem = closest(eTarget, function(el) {
              return (el.tagName && el.tagName.toUpperCase() === 'FIGURE');
          });

          if(!clickedListItem) {
              return;
          }

          // find index of clicked item by looping through all child nodes
          // alternatively, you may define index via data- attribute
          var clickedGallery = clickedListItem.parentNode,
              childNodes = clickedListItem.parentNode.childNodes,
              numChildNodes = childNodes.length,
              nodeIndex = 0,
              index;

          for (var i = 0; i < numChildNodes; i++) {
              if(childNodes[i].nodeType !== 1) {
                  continue;
              }

              if(childNodes[i] === clickedListItem) {
                  index = nodeIndex;
                  break;
              }
              nodeIndex++;
          }



          if(index >= 0) {
              // open PhotoSwipe if valid index found
              openPhotoSwipe( index, clickedGallery );
          }
          return false;
      };

      // parse picture index and gallery index from URL (#&pid=1&gid=2)
      var photoswipeParseHash = function() {
          var hash = window.location.hash.substring(1),
          params = {};

          if(hash.length < 5) {
              return params;
          }

          var vars = hash.split('&');
          for (var i = 0; i < vars.length; i++) {
              if(!vars[i]) {
                  continue;
              }
              var pair = vars[i].split('=');
              if(pair.length < 2) {
                  continue;
              }
              params[pair[0]] = pair[1];
          }

          if(params.gid) {
              params.gid = parseInt(params.gid, 10);
          }

          return params;
      };

      var openPhotoSwipe = function(index, galleryElement, disableAnimation, fromURL) {
          var pswpElement = document.querySelectorAll('.pswp')[0],
              gallery,
              options,
              items;

          items = parseThumbnailElements(galleryElement);

          // define options (if needed)
          options = {

              // define gallery index (for URL)
              galleryUID: galleryElement.getAttribute('data-pswp-uid'),

              getThumbBoundsFn: function(index) {
                  // See Options -> getThumbBoundsFn section of documentation for more info
                  var thumbnail = items[index].el.getElementsByTagName('img')[0], // find thumbnail
                      pageYScroll = window.pageYOffset || document.documentElement.scrollTop,
                      rect = thumbnail.getBoundingClientRect();

                  return {x:rect.left, y:rect.top + pageYScroll, w:rect.width};
              }

          };

          // PhotoSwipe opened from URL
          if(fromURL) {
              if(options.galleryPIDs) {
                  // parse real index when custom PIDs are used
                  // http://photoswipe.com/documentation/faq.html#custom-pid-in-url
                  for(var j = 0; j < items.length; j++) {
                      if(items[j].pid == index) {
                          options.index = j;
                          break;
                      }
                  }
              } else {
                  // in URL indexes start from 1
                  options.index = parseInt(index, 10) - 1;
              }
          } else {
              options.index = parseInt(index, 10);
          }

          // exit if index not found
          if( isNaN(options.index) ) {
              return;
          }

          if(disableAnimation) {
              options.showAnimationDuration = 0;
          }

          // Pass data to PhotoSwipe and initialize it
          gallery = new PhotoSwipe( pswpElement, PhotoSwipeUI_Default, items, options);
          gallery.init();
      };

      // loop through all gallery elements and bind events
      var galleryElements = document.querySelectorAll( gallerySelector );

      for(var i = 0, l = galleryElements.length; i < l; i++) {
          galleryElements[i].setAttribute('data-pswp-uid', i+1);
          galleryElements[i].onclick = onThumbnailsClick;
      }

      // Parse URL and open gallery if it contains #&pid=3&gid=1
      var hashData = photoswipeParseHash();
      if(hashData.pid && hashData.gid) {
          openPhotoSwipe( hashData.pid ,  galleryElements[ hashData.gid - 1 ], true, true );
      }
  };

  // execute above function
  initPhotoSwipeFromDOM('.my-gallery');

});
