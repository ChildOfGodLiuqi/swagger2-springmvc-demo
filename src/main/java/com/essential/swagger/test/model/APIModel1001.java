package com.essential.swagger.test.model;/*
package com.essential.web.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;


/**
 * Created by esse-Zhurong on 2015/9/6.
 */

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import java.io.Serializable;

@ApiModel
public class APIModel1001 implements Serializable {
    @ApiModelProperty("用户编号")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long userId;

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("用户小头像")
    private String smallAvatar;

    @ApiModelProperty("用户头像")
    private String avatar;

    @ApiModelProperty("关注数")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long focusTotalCount;

    @ApiModelProperty("粉丝数")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long fansTotalCount;

    @ApiModelProperty("推荐数")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long recommendTotalCount;

    @ApiModelProperty("想去数")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long wantGoTotalCount;

    @ApiModelProperty("点赞数")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long voteTotalCount;

    @ApiModelProperty("被赞数")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long votedTotalCount;

    @ApiModelProperty("被收藏数")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long collectedTotalCount;

    @ApiModelProperty("是否已关注")
    @JsonSerialize(using = ToStringSerializer.class)
    private Boolean focused;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getFocusTotalCount() {
        return focusTotalCount;
    }

    public void setFocusTotalCount(Long focusTotalCount) {
        this.focusTotalCount = focusTotalCount;
    }

    public Long getFansTotalCount() {
        return fansTotalCount;
    }

    public void setFansTotalCount(Long fansTotalCount) {
        this.fansTotalCount = fansTotalCount;
    }

    public Long getRecommendTotalCount() {
        return recommendTotalCount;
    }

    public void setRecommendTotalCount(Long recommendTotalCount) {
        this.recommendTotalCount = recommendTotalCount;
    }

    public Long getWantGoTotalCount() {
        return wantGoTotalCount;
    }

    public void setWantGoTotalCount(Long wantGoTotalCount) {
        this.wantGoTotalCount = wantGoTotalCount;
    }

    public Long getVoteTotalCount() {
        return voteTotalCount;
    }

    public void setVoteTotalCount(Long voteTotalCount) {
        this.voteTotalCount = voteTotalCount;
    }

    public Long getVotedTotalCount() {
        return votedTotalCount;
    }

    public void setVotedTotalCount(Long votedTotalCount) {
        this.votedTotalCount = votedTotalCount;
    }

    public Long getCollectedTotalCount() {
        return collectedTotalCount;
    }

    public void setCollectedTotalCount(Long collectedTotalCount) {
        this.collectedTotalCount = collectedTotalCount;
    }

    public Boolean getFocused() {
        return focused;
    }

    public void setFocused(Boolean focused) {
        this.focused = focused;
    }

    public String getSmallAvatar() {
        return smallAvatar;
    }

    public void setSmallAvatar(String smallAvatar) {
        this.smallAvatar = smallAvatar;
    }
}

