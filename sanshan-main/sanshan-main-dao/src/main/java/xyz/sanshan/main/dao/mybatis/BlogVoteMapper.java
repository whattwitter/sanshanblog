package xyz.sanshan.main.dao.mybatis;

import xyz.sanshan.main.pojo.entity.BlogVoteDO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

/**
 */
public interface BlogVoteMapper extends Mapper<BlogVoteDO>{

    @Update("update blog_vote set favours =favours+1 where blog_id=#{blogId}")
    int incrFavours(long blogId);

    @Update("update blog_vote set favours = favours-1 where blog_id=#{blogId}")
    int decrFavours(long blogId);

    @Update("update blog_vote set treads =treads+1 where blog_id=#{blogId}")
    int incrTreads(long blogId);

    @Update("update blog_vote set treads =treads-1 where blog_id=#{blogId}")
    int decrTreads(long blogId);

    @Select("SELECT favours,treads  FROM blog_vote WHERE  blog_id=#{blogId}")
     BlogVoteDO queryVote(long blogId);

    @Delete("DELETE FROM blog_vote WHERE blog_id=#{blog_id}")
    int deleteByBlogId(@Param("blog_id") Long blogId);
}
