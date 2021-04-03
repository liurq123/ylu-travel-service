package pers.lrq.service;


import org.springframework.beans.factory.annotation.Autowired;
import pers.lrq.domain.CommentBean;
import pers.lrq.mapper.CommentMapper;

import java.util.List;


public interface HandleComment {
   public int addComment(CommentBean commentBean);

   public int addDelComment(CommentBean commentBean);

   public List<CommentBean> getCommentById(Integer tid);

   public List<CommentBean> getDelCommentById(Integer fid);
}
