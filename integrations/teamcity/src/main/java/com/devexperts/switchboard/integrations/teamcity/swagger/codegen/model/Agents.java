/*
 * TeamCity REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2018.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.devexperts.switchboard.integrations.teamcity.swagger.codegen.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Agents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-01T01:12:43.660+03:00")
@XmlRootElement(name = "agents")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "agents")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Agents {
    @JsonProperty("count")
    @JacksonXmlProperty(isAttribute = true, localName = "count")
    @XmlAttribute(name = "count")
    private Integer count = null;

    @JsonProperty("nextHref")
    @JacksonXmlProperty(isAttribute = true, localName = "nextHref")
    @XmlAttribute(name = "nextHref")
    private String nextHref = null;

    @JsonProperty("prevHref")
    @JacksonXmlProperty(isAttribute = true, localName = "prevHref")
    @XmlAttribute(name = "prevHref")
    private String prevHref = null;

    @JsonProperty("href")
    @JacksonXmlProperty(isAttribute = true, localName = "href")
    @XmlAttribute(name = "href")
    private String href = null;

    @JsonProperty("agent")
    // Is a container wrapped=false
    // items.name=agent items.baseName=agent items.xmlName= items.xmlNamespace=
    // items.example= items.type=Agent
    @XmlElement(name = "agent")
    private List<Agent> agent = null;

    public Agents count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     *
     * @return count
     **/
    @ApiModelProperty(value = "")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Agents nextHref(String nextHref) {
        this.nextHref = nextHref;
        return this;
    }

    /**
     * Get nextHref
     *
     * @return nextHref
     **/
    @ApiModelProperty(value = "")
    public String getNextHref() {
        return nextHref;
    }

    public void setNextHref(String nextHref) {
        this.nextHref = nextHref;
    }

    public Agents prevHref(String prevHref) {
        this.prevHref = prevHref;
        return this;
    }

    /**
     * Get prevHref
     *
     * @return prevHref
     **/
    @ApiModelProperty(value = "")
    public String getPrevHref() {
        return prevHref;
    }

    public void setPrevHref(String prevHref) {
        this.prevHref = prevHref;
    }

    public Agents href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get href
     *
     * @return href
     **/
    @ApiModelProperty(value = "")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Agents agent(List<Agent> agent) {
        this.agent = agent;
        return this;
    }

    public Agents addAgentItem(Agent agentItem) {
        if (this.agent == null) {
            this.agent = new ArrayList<Agent>();
        }
        this.agent.add(agentItem);
        return this;
    }

    /**
     * Get agent
     *
     * @return agent
     **/
    @ApiModelProperty(value = "")
    public List<Agent> getAgent() {
        return agent;
    }

    public void setAgent(List<Agent> agent) {
        this.agent = agent;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Agents agents = (Agents) o;
        return Objects.equals(this.count, agents.count) &&
                Objects.equals(this.nextHref, agents.nextHref) &&
                Objects.equals(this.prevHref, agents.prevHref) &&
                Objects.equals(this.href, agents.href) &&
                Objects.equals(this.agent, agents.agent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, nextHref, prevHref, href, agent);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Agents {\n");

        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    nextHref: ").append(toIndentedString(nextHref)).append("\n");
        sb.append("    prevHref: ").append(toIndentedString(prevHref)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
