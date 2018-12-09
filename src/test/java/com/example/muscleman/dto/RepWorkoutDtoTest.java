package com.example.muscleman.dto;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RepWorkoutDtoTest {

    private static final Integer ID_CONSTANT;
    private static final String NAME_CONSTANT;
    private static final String TEXT_CONSTANT;
    private static final List<Integer> REC_REPS_CONSTANT;
    private static final Integer REC_SETS_CONSTANT;
    private static final Integer MUSCLE_GROUP_CONSTANT;
    private static final Integer USER_ID_CONSTANT;
    static {
        ID_CONSTANT = 0;
        NAME_CONSTANT = "name";
        TEXT_CONSTANT = "text";
        REC_REPS_CONSTANT = new ArrayList<>();
        REC_REPS_CONSTANT.add(5);
        REC_REPS_CONSTANT.add(6);
        REC_SETS_CONSTANT = 1;
        MUSCLE_GROUP_CONSTANT = 2;
        USER_ID_CONSTANT = 3;
    }

    private final RepWorkoutDto repWorkoutDto = new RepWorkoutDto();

    @Before
    public void initialize() {
        repWorkoutDto.setId(ID_CONSTANT);
        repWorkoutDto.setName(NAME_CONSTANT);
        repWorkoutDto.setText(TEXT_CONSTANT);
        repWorkoutDto.setRecReps((ArrayList<Integer>)REC_REPS_CONSTANT);
        repWorkoutDto.setRecSets(REC_SETS_CONSTANT);
        repWorkoutDto.setMuscleGroup(MUSCLE_GROUP_CONSTANT);
        repWorkoutDto.setUserId(USER_ID_CONSTANT);
    }

    @Test
    public void getIdTest() {
        assertEquals(ID_CONSTANT, repWorkoutDto.getId());
    }

    @Test
    public void setIdTest() {
        assertEquals(ID_CONSTANT, repWorkoutDto.getId());
        Integer newId = ID_CONSTANT + 1;
        assertNotEquals(ID_CONSTANT, newId);
        repWorkoutDto.setId(newId);
        assertEquals(newId, repWorkoutDto.getId());
    }

    @Test
    public void getNameTest() {
        assertEquals(NAME_CONSTANT, repWorkoutDto.getName());
    }

    @Test
    public void setNameTest() {
        assertEquals(NAME_CONSTANT, repWorkoutDto.getName());
        String newName = "newName";
        assertNotEquals(NAME_CONSTANT, newName);
        repWorkoutDto.setName(newName);
        assertEquals(newName, repWorkoutDto.getName());
    }

    @Test
    public void getTextTest() {
        assertEquals(TEXT_CONSTANT, repWorkoutDto.getText());
    }

    @Test
    public void setTextTest() {
        assertEquals(TEXT_CONSTANT, repWorkoutDto.getText());
        String newText = "newText";
        assertNotEquals(TEXT_CONSTANT, newText);
        repWorkoutDto.setText(newText);
        assertEquals(newText, repWorkoutDto.getText());
    }

    @Test
    public void getRecRepsTest() {
        assertEquals(REC_REPS_CONSTANT, repWorkoutDto.getRecReps());
    }

    @Test
    public void setRecRepsTest() {
        assertEquals(REC_REPS_CONSTANT, repWorkoutDto.getRecReps());
        ArrayList<Integer> newRecReps = new ArrayList<>();
        assertNotEquals(REC_REPS_CONSTANT, newRecReps);
        repWorkoutDto.setRecReps(newRecReps);
        assertEquals(newRecReps, repWorkoutDto.getRecReps());
    }

    @Test
    public void getRecSetsTest() {
        assertEquals(REC_SETS_CONSTANT, repWorkoutDto.getRecSets());
    }

    @Test
    public void setRecSetsTest() {
        assertEquals(REC_SETS_CONSTANT, repWorkoutDto.getRecSets());
        Integer newRecSets = REC_SETS_CONSTANT + 1;
        assertNotEquals(REC_SETS_CONSTANT, newRecSets);
        repWorkoutDto.setRecSets(newRecSets);
        assertEquals(newRecSets, repWorkoutDto.getRecSets());
    }

    @Test
    public void getMuscleGroupTest() {
        assertEquals(MUSCLE_GROUP_CONSTANT, repWorkoutDto.getMuscleGroup());
    }

    @Test
    public void setMuscleGroupTest() {
        assertEquals(MUSCLE_GROUP_CONSTANT, repWorkoutDto.getMuscleGroup());
        Integer newMuscleGroup = MUSCLE_GROUP_CONSTANT + 1;
        assertNotEquals(MUSCLE_GROUP_CONSTANT, newMuscleGroup);
        repWorkoutDto.setMuscleGroup(newMuscleGroup);
        assertEquals(newMuscleGroup, repWorkoutDto.getMuscleGroup());
    }

    @Test
    public void getUserIdTest() {
        assertEquals(USER_ID_CONSTANT, repWorkoutDto.getUserId());
    }

    @Test
    public void setUserIdTest() {
        assertEquals(USER_ID_CONSTANT, repWorkoutDto.getUserId());
        Integer newUserId = USER_ID_CONSTANT + 1;
        assertNotEquals(USER_ID_CONSTANT, newUserId);
        repWorkoutDto.setUserId(newUserId);
        assertEquals(newUserId, repWorkoutDto.getUserId());
    }
}
