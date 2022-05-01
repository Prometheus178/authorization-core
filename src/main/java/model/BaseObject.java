package model;

/**
 * Author: Sergey.
 */
public abstract class BaseObject {

    protected Long id;
    protected boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
