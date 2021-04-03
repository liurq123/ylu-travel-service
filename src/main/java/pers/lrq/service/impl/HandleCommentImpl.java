package pers.lrq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.lrq.domain.CommentBean;
import pers.lrq.mapper.CommentMapper;
import pers.lrq.service.HandleComment;

import java.util.List;

@Service
public class HandleCommentImpl implements HandleComment {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int addComment(CommentBean commentBean) {
        int result = commentMapper.addComment(commentBean);
        return result;
    }

    @Override
    public int addDelComment(CommentBean commentBean) {
        int result = commentMapper.addDelComment(commentBean);
        return result;
    }

    @Override
    public List<CommentBean> getCommentById(Integer tid) {
        List<CommentBean> result = commentMapper.getCommentById(tid);
        return result;
    }

    @Override
    public List<CommentBean> getDelCommentById(Integer fid) {
         List<CommentBean> result = commentMapper.getDelCommentById(fid);
        return result;
    }


}
