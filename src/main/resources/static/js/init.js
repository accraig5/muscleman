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

  //For log in page, makes sure both sections are filled in
  function checkLoginValidation() {
    if (($('#username').val()) && ($('#password').val())) {
      $('#login_submit').prop('disabled', false);
      $('#login_submit').removeClass('disabled');
    }
    else {
      $('#login_submit').prop('disabled', true);
      $('#login_submit').addClass('disabled');
    }
  }

  //Checks if the whole email form is filled out correctly
  function checkRegistrationValidation() {
    if (validateEmail($('#email').val()) && ($('#firstName').val()) && ($('#lastName').val()) && ($('#username').val()) && ($('#password').val())) {
      $('#registration_submit').prop('disabled', false);
      $('#registration_submit').removeClass('disabled');
    }
    else {
      $('#registration_submit').prop('disabled', true);
      $('#registration_submit').addClass('disabled');
    }
  }

  //Edits username field on keypress
  $('#username').on('keyup', function() {
    if (($.trim(this.value).length)) {
      $('#username').addClass('valid');
      $('#username').removeClass('invalid');
    }
    else if (!$.trim(this.value).length) {
      $('#username').removeClass('invalid');
      $('#username').removeClass('valid');
    }
    else {
      $('#username').removeClass('valid');
      $('#username').addClass('invalid');
    }
    checkLoginValidation();
    checkRegistrationValidation();
  });

  //Edits password field on keypress
  $('#password').on('keyup', function() {
    if (($.trim(this.value).length)) {
      $('#password').addClass('valid');
      $('#password').removeClass('invalid');
    }
    else if (!$.trim(this.value).length) {
      $('#password').removeClass('invalid');
      $('#password').removeClass('valid');
    }
    else {
      $('#password').removeClass('valid');
      $('#password').addClass('invalid');
    }
    checkLoginValidation();
    checkRegistrationValidation();
  });

  //Edits first name field on keypress
  $('#firstName').on('keyup', function() {
    if (($.trim(this.value).length)) {
      $('#firstName').addClass('valid');
      $('#firstName').removeClass('invalid');
    }
    else if (!$.trim(this.value).length) {
      $('#firstName').removeClass('invalid');
      $('#firstName').removeClass('valid');
    }
    else {
      $('#firstName').removeClass('valid');
      $('#firstName').addClass('invalid');
    }
    checkRegistrationValidation();
  });

  //Edits last name field on keypress
  $('#lastName').on('keyup', function() {
    if (($.trim(this.value).length)) {
      $('#lastName').addClass('valid');
      $('#lastName').removeClass('invalid');
    }
    else if (!$.trim(this.value).length) {
      $('#lastName').removeClass('invalid');
      $('#lastName').removeClass('valid');
    }
    else {
      $('#lastName').removeClass('valid');
      $('#lastName').addClass('invalid');
    }
    checkRegistrationValidation();
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
    checkRegistrationValidation();
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

  //Adds hover animation for about button
  $('#aboutPMDBtn').hover(function() {
    $(this).addClass('pulse');
  }, function() {
    $(this).removeClass('pulse');
  });

  //Scrolls to next section
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

});
