package pers.lrq.mapper;

import pers.lrq.domain.CommentBean;

import java.util.List;


public interface CommentMapper {
    public int addComment(CommentBean commentBean);

    public int addDelComment(CommentBean commentBean);

    public List<CommentBean> getCommentById(Integer tid);

    public List<CommentBean> getDelCommentById(Integer fid);
    
}
