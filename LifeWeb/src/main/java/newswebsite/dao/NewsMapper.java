package newswebsite.dao;

import java.util.HashMap;
import java.util.List;
import newswebsite.pojo.News;
import newswebsite.pojo.NewsExample;
import newswebsite.pojo.NewsWithBLOBs;
import newswebsite.pojo.Title;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    long countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer newsNid);

    int insert(NewsWithBLOBs record);

    int insertSelective(NewsWithBLOBs record);

    List<NewsWithBLOBs> selectByExampleWithBLOBs(NewsExample example);

    List<News> selectByExample(NewsExample example);

    NewsWithBLOBs selectByPrimaryKey(Integer newsNid);

    int updateByExampleSelective(@Param("record") NewsWithBLOBs record, @Param("example") NewsExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsWithBLOBs record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(NewsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NewsWithBLOBs record);

    int updateByPrimaryKey(News record);

    List<News> select_keyword(String time);

    List<News> select_right(HashMap<String,Object> record);

    News select_article(Integer newsid);

    List<News> select_kindArticle(Integer newsTid);

    String  select_searchkey (String time);

    List<News> select_search (HashMap<String,Object> map);

    List<News> select_top(String time);

    int update_approve(int newsNid);

    int update_comment(int newsNid);

    List<News> select_searchtitle (String search);

    List<News> search_channel(int titleId);

    List<Title>relevant_channel(int newsTid);
}