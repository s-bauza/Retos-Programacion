
package org.example.models;





public class Pagination {

    
    private Integer lastVisiblePage;
    
    private Boolean hasNextPage;
    
    private Integer currentPage;
    
    private Items items;

    public Integer getLastVisiblePage() {
        return lastVisiblePage;
    }

    public void setLastVisiblePage(Integer lastVisiblePage) {
        this.lastVisiblePage = lastVisiblePage;
    }

    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

}
