
package com.abhishek.fundhawk.model.SearchResult;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("search_query")
    @Expose
    private String searchQuery;
    @SerializedName("facets")
    @Expose
    private Facets facets;
    @SerializedName("search_results")
    @Expose
    private List<SearchResult> searchResults = null;
    @SerializedName("search_results_count")
    @Expose
    private Integer searchResultsCount;

    public String getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String searchQuery) {
        this.searchQuery = searchQuery;
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    public List<SearchResult> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }

    public Integer getSearchResultsCount() {
        return searchResultsCount;
    }

    public void setSearchResultsCount(Integer searchResultsCount) {
        this.searchResultsCount = searchResultsCount;
    }

}
