package xyz.sanshan.main.service.vo;

import xyz.sanshan.main.pojo.dto.MarkDownBlogDTO;
import xyz.sanshan.main.pojo.dto.UEditorBlogDTO;
import xyz.sanshan.common.info.EditorTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BlogVO  implements Serializable{
    private static final long serialVersionUID = -3414470325758706103L;
    /**
     * 1为markdown-blog
     * 0则为UEditor-blog
     */
    private Integer type;

    private Long id;

    private String user;

    private String title;

    private String content;

    private Date time;

    private String tag;

    public BlogVO(){

    }

    public BlogVO(UEditorBlogDTO uEditorBlog) {
        this.type= EditorTypeEnum.UEDITOR_EDITOR.getIndex();
        this.id = uEditorBlog.getId();
        this.user  =uEditorBlog.getUser();
        this.title = uEditorBlog.getTitle();
        this.content = uEditorBlog.getContent();
        this.time = uEditorBlog.getTime();
        this.tag = uEditorBlog.getTag();
    }

    public BlogVO(MarkDownBlogDTO markDownBlog) {
        this.type= EditorTypeEnum.MARKDOWN_EDITOR.getIndex();
        this.id = markDownBlog.getId();
        this.user  =markDownBlog.getUser();
        this.title = markDownBlog.getTitle();
        this.content = markDownBlog.getContent();
        this.time = markDownBlog.getTime();
        this.tag = markDownBlog.getTag();
    }



}
