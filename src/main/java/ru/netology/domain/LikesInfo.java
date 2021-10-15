package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean canLike;
    private boolean canRemoveLike;
    private boolean isLiked;

    public boolean isCanSeeWhoLiked() {
        return canSeeWhoLiked;
    }

    public void setCanSeeWhoLiked(boolean canSeeWhoLiked) {
        this.canSeeWhoLiked = canSeeWhoLiked;
    }

    private boolean canSeeWhoLiked;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCaneRemoveLike() {
        return canRemoveLike;
    }

    public void setCaneRemoveLike(boolean caneRemoveLike) {
        this.canRemoveLike = caneRemoveLike;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

}