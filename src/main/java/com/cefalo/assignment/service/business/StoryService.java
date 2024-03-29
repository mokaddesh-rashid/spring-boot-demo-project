package com.cefalo.assignment.service.business;

import com.cefalo.assignment.exception.EntityNotFoundException;
import com.cefalo.assignment.exception.UnAuthorizedRequestException;
import com.cefalo.assignment.model.orm.Story;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import java.util.List;
import java.util.Optional;

public interface StoryService {
    Story saveNewStoryObject(Story story);
    Story getStoryById(Long storyId) throws EntityNotFoundException;
    Story checkAuthorityThenUpdateStoryById(Long storyId, Story newVersionOfStory, Boolean isPatchUpdate)
            throws EntityNotFoundException, UnAuthorizedRequestException, IllegalAccessException ;
    int checkAuthorityThenDeleteStoryById(Long storyId) throws EntityNotFoundException, UnAuthorizedRequestException;
    List<Story> findAllForPagination(int pageNumber,int limit, String columnName);
    Story updateOldStoryByNewStory(Story olderVersionOfStory, Story newVersionOfStory) throws IllegalArgumentException, IllegalAccessException;
}
