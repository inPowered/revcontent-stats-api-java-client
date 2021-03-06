package com.xy1m.model.boost;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoostStats {
    private String date;
    private String impressions;
    private String viewableImpressions;
    private String clicks;
    private String conversions;
    private String ctr;
    private String avgCpc;
    private String cost;
    @JsonProperty("return")
    private String valueReturn;
    private String profit;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImpressions() {
        return impressions;
    }

    public void setImpressions(String impressions) {
        this.impressions = impressions;
    }

    public String getViewableImpressions() {
        return viewableImpressions;
    }

    public void setViewableImpressions(String viewableImpressions) {
        this.viewableImpressions = viewableImpressions;
    }

    public String getClicks() {
        return clicks;
    }

    public void setClicks(String clicks) {
        this.clicks = clicks;
    }

    public String getConversions() {
        return conversions;
    }

    public void setConversions(String conversions) {
        this.conversions = conversions;
    }

    public String getCtr() {
        return ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr;
    }

    public String getAvgCpc() {
        return avgCpc;
    }

    public void setAvgCpc(String avgCpc) {
        this.avgCpc = avgCpc;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getValueReturn() {
        return valueReturn;
    }

    public void setValueReturn(String valueReturn) {
        this.valueReturn = valueReturn;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoostStats)) return false;
        BoostStats that = (BoostStats) o;
        return Objects.equals(getDate(), that.getDate()) &&
                Objects.equals(getImpressions(), that.getImpressions()) &&
                Objects.equals(getViewableImpressions(), that.getViewableImpressions()) &&
                Objects.equals(getClicks(), that.getClicks()) &&
                Objects.equals(getConversions(), that.getConversions()) &&
                Objects.equals(getCtr(), that.getCtr()) &&
                Objects.equals(getAvgCpc(), that.getAvgCpc()) &&
                Objects.equals(getCost(), that.getCost()) &&
                Objects.equals(getValueReturn(), that.getValueReturn()) &&
                Objects.equals(getProfit(), that.getProfit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getImpressions(), getViewableImpressions(), getClicks(), getConversions(), getCtr(), getAvgCpc(), getCost(), getValueReturn(), getProfit());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BoostStats{");
        sb.append("date='").append(date).append('\'');
        sb.append(", impressions='").append(impressions).append('\'');
        sb.append(", viewableImpressions='").append(viewableImpressions).append('\'');
        sb.append(", clicks='").append(clicks).append('\'');
        sb.append(", conversions='").append(conversions).append('\'');
        sb.append(", ctr='").append(ctr).append('\'');
        sb.append(", avgCpc='").append(avgCpc).append('\'');
        sb.append(", cost='").append(cost).append('\'');
        sb.append(", valueReturn='").append(valueReturn).append('\'');
        sb.append(", profit='").append(profit).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
