package com.example.muscleman.dto;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UserRepWorkoutDtoTests {

    private static final Integer CONSTANT_USER_ID = 1;
    private static final Integer CONSTANT_WORKOUT_ID = 1;
    private static final String CONSTANT_REPS_COMPLETE = "repsComplete";
    private static final Integer CONSTANT_SETS_COMPLETE = 1;
    private static final String CONSTANT_WEIGHT = "weight";
    private static final String CONSTANT_DATE = "date";

    private final UserRepWorkoutDto userRepWorkoutDto = new UserRepWorkoutDto();

    @Before
    public void init() {
        userRepWorkoutDto.setUserId(CONSTANT_USER_ID);
        userRepWorkoutDto.setWorkoutId(CONSTANT_WORKOUT_ID);
        userRepWorkoutDto.setRepsComplete(CONSTANT_REPS_COMPLETE);
        userRepWorkoutDto.setSetsComplete(CONSTANT_SETS_COMPLETE);
        userRepWorkoutDto.setWeight(CONSTANT_WEIGHT);
        userRepWorkoutDto.setDate(CONSTANT_DATE);
    }

    @Test
    public void getIdTest() {
        assertEquals(CONSTANT_USER_ID, userRepWorkoutDto.getUserId());
    }

    @Test
    public void setUserIdTest() {
        assertEquals(CONSTANT_USER_ID, userRepWorkoutDto.getUserId());
        Integer newUserId = 2;
        assertNotEquals(newUserId, CONSTANT_USER_ID);
        userRepWorkoutDto.setUserId(newUserId);
        assertEquals(newUserId, userRepWorkoutDto.getUserId());
    }

    @Test
    public void getWorkoutIdTest() {
        assertEquals(CONSTANT_WORKOUT_ID, userRepWorkoutDto.getWorkoutId());
    }

    @Test
    public void setWorkoutIdTest() {
        assertEquals(CONSTANT_WORKOUT_ID, userRepWorkoutDto.getWorkoutId());
        Integer newWorkoutId = 2;
        assertNotEquals(newWorkoutId, CONSTANT_WORKOUT_ID);
        userRepWorkoutDto.setWorkoutId(newWorkoutId);
        assertEquals(newWorkoutId, userRepWorkoutDto.getWorkoutId());
    }

    @Test
    public void getRepsCompleteTest() {
        assertEquals(CONSTANT_REPS_COMPLETE, userRepWorkoutDto.getRepsComplete());
    }

    @Test
    public void setRepsCompleteTest() {
        assertEquals(CONSTANT_REPS_COMPLETE, userRepWorkoutDto.getRepsComplete());
        String newRepsComplete = "newReps";
        assertNotEquals(newRepsComplete, CONSTANT_REPS_COMPLETE);
        userRepWorkoutDto.setRepsComplete(newRepsComplete);
        assertEquals(newRepsComplete, userRepWorkoutDto.getRepsComplete());
    }

    @Test
    public void getSetsCompleteTest() {
        assertEquals(CONSTANT_SETS_COMPLETE, userRepWorkoutDto.getSetsComplete());
    }

    @Test
    public void setSetsCompleteTest() {
        assertEquals(CONSTANT_SETS_COMPLETE, userRepWorkoutDto.getSetsComplete());
        Integer newSetsComplete = 2;
        assertNotEquals(newSetsComplete, CONSTANT_SETS_COMPLETE);
        userRepWorkoutDto.setSetsComplete(newSetsComplete);
        assertEquals(newSetsComplete, userRepWorkoutDto.getSetsComplete());
    }

    @Test
    public void getWeightTest() {
        assertEquals(CONSTANT_WEIGHT, userRepWorkoutDto.getWeight());
    }

    @Test
    public void setWeightTest() {
        assertEquals(CONSTANT_WEIGHT, userRepWorkoutDto.getWeight());
        String newWeight = "newWeight";
        assertNotEquals(newWeight, CONSTANT_WEIGHT);
        userRepWorkoutDto.setWeight(newWeight);
        assertEquals(newWeight, userRepWorkoutDto.getWeight());
    }

    @Test
    public void getDateTest() {
        assertEquals(CONSTANT_DATE, userRepWorkoutDto.getDate());
    }

    @Test
    public void setDateTest() {
        assertEquals(CONSTANT_DATE, userRepWorkoutDto.getDate());
        String newDate = "newDate";
        assertNotEquals(newDate, CONSTANT_DATE);
        userRepWorkoutDto.setDate(newDate);
        assertEquals(newDate, userRepWorkoutDto.getDate());
    }
}
