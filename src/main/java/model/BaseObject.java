package model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseObject that = (BaseObject) o;
        return deleted == that.deleted && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deleted);
    }

    @Override
    public String toString() {
        return "BaseObject{" +
                "id=" + id +
                ", deleted=" + deleted +
                '}';
    }
}
