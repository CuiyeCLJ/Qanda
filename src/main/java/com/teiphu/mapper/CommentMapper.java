package com.teiphu.mapper;

import com.teiphu.pojo.CommentDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @Author Teiphu
 * @Date 2019.04.17 下午 09:45
 **/
@Mapper
public interface CommentMapper {

    int insertComment(CommentDo comment);

    int deleteComment(Integer commentId);

    int deleteCommentByAnswer(Integer answerId);

    int updateComment(CommentDo comment);

    CommentDo getComment(Integer commentId);

    List<CommentDo> listCommentByParent(Integer parentCommentId);

    List<CommentDo> listCommentByAnswer(Integer answerId);

    List<CommentDo> listTopCommentByAnswer(Integer answerId);

    List<CommentDo> listComment();

    List<CommentDo> listComentPaging(RowBounds rowBounds);

    int countComment();

    List<CommentDo> listComentBySearch(String searchText, RowBounds rowBounds);

    int countCommentBySearch(String searchText);
}
