package com.kodnest.tunehub.service;

import java.util.List;

import com.kodnest.tunehub.entity.PlayList;

public interface PlayListService {

   public void addPlayList(PlayList playList);

   public List<PlayList> fetchAllPlayList();

   

}
