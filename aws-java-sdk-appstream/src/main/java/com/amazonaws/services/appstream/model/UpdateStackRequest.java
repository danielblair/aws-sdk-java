/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateStack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack name for display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description for display.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the stack.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     */
    private java.util.List<StorageConnector> storageConnectors;
    /**
     * <p>
     * Deletes the storage connectors currently enabled for the stack.
     * </p>
     */
    @Deprecated
    private Boolean deleteStorageConnectors;
    /**
     * <p>
     * The URL the user is redirected to after the streaming session ends.
     * </p>
     */
    private String redirectURL;
    /**
     * <p>
     * The stack attributes to delete.
     * </p>
     */
    private java.util.List<String> attributesToDelete;

    /**
     * <p>
     * The stack name for display.
     * </p>
     * 
     * @param displayName
     *        The stack name for display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The stack name for display.
     * </p>
     * 
     * @return The stack name for display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The stack name for display.
     * </p>
     * 
     * @param displayName
     *        The stack name for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @param description
     *        The description for display.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @return The description for display.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @param description
     *        The description for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the stack.
     * </p>
     * 
     * @param name
     *        The name of the stack.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the stack.
     * </p>
     * 
     * @return The name of the stack.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the stack.
     * </p>
     * 
     * @param name
     *        The name of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * 
     * @return The storage connectors to enable.
     */

    public java.util.List<StorageConnector> getStorageConnectors() {
        return storageConnectors;
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * 
     * @param storageConnectors
     *        The storage connectors to enable.
     */

    public void setStorageConnectors(java.util.Collection<StorageConnector> storageConnectors) {
        if (storageConnectors == null) {
            this.storageConnectors = null;
            return;
        }

        this.storageConnectors = new java.util.ArrayList<StorageConnector>(storageConnectors);
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageConnectors(java.util.Collection)} or {@link #withStorageConnectors(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param storageConnectors
     *        The storage connectors to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withStorageConnectors(StorageConnector... storageConnectors) {
        if (this.storageConnectors == null) {
            setStorageConnectors(new java.util.ArrayList<StorageConnector>(storageConnectors.length));
        }
        for (StorageConnector ele : storageConnectors) {
            this.storageConnectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * 
     * @param storageConnectors
     *        The storage connectors to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withStorageConnectors(java.util.Collection<StorageConnector> storageConnectors) {
        setStorageConnectors(storageConnectors);
        return this;
    }

    /**
     * <p>
     * Deletes the storage connectors currently enabled for the stack.
     * </p>
     * 
     * @param deleteStorageConnectors
     *        Deletes the storage connectors currently enabled for the stack.
     */
    @Deprecated
    public void setDeleteStorageConnectors(Boolean deleteStorageConnectors) {
        this.deleteStorageConnectors = deleteStorageConnectors;
    }

    /**
     * <p>
     * Deletes the storage connectors currently enabled for the stack.
     * </p>
     * 
     * @return Deletes the storage connectors currently enabled for the stack.
     */
    @Deprecated
    public Boolean getDeleteStorageConnectors() {
        return this.deleteStorageConnectors;
    }

    /**
     * <p>
     * Deletes the storage connectors currently enabled for the stack.
     * </p>
     * 
     * @param deleteStorageConnectors
     *        Deletes the storage connectors currently enabled for the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateStackRequest withDeleteStorageConnectors(Boolean deleteStorageConnectors) {
        setDeleteStorageConnectors(deleteStorageConnectors);
        return this;
    }

    /**
     * <p>
     * Deletes the storage connectors currently enabled for the stack.
     * </p>
     * 
     * @return Deletes the storage connectors currently enabled for the stack.
     */
    @Deprecated
    public Boolean isDeleteStorageConnectors() {
        return this.deleteStorageConnectors;
    }

    /**
     * <p>
     * The URL the user is redirected to after the streaming session ends.
     * </p>
     * 
     * @param redirectURL
     *        The URL the user is redirected to after the streaming session ends.
     */

    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
    }

    /**
     * <p>
     * The URL the user is redirected to after the streaming session ends.
     * </p>
     * 
     * @return The URL the user is redirected to after the streaming session ends.
     */

    public String getRedirectURL() {
        return this.redirectURL;
    }

    /**
     * <p>
     * The URL the user is redirected to after the streaming session ends.
     * </p>
     * 
     * @param redirectURL
     *        The URL the user is redirected to after the streaming session ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStackRequest withRedirectURL(String redirectURL) {
        setRedirectURL(redirectURL);
        return this;
    }

    /**
     * <p>
     * The stack attributes to delete.
     * </p>
     * 
     * @return The stack attributes to delete.
     * @see StackAttribute
     */

    public java.util.List<String> getAttributesToDelete() {
        return attributesToDelete;
    }

    /**
     * <p>
     * The stack attributes to delete.
     * </p>
     * 
     * @param attributesToDelete
     *        The stack attributes to delete.
     * @see StackAttribute
     */

    public void setAttributesToDelete(java.util.Collection<String> attributesToDelete) {
        if (attributesToDelete == null) {
            this.attributesToDelete = null;
            return;
        }

        this.attributesToDelete = new java.util.ArrayList<String>(attributesToDelete);
    }

    /**
     * <p>
     * The stack attributes to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesToDelete(java.util.Collection)} or {@link #withAttributesToDelete(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param attributesToDelete
     *        The stack attributes to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackAttribute
     */

    public UpdateStackRequest withAttributesToDelete(String... attributesToDelete) {
        if (this.attributesToDelete == null) {
            setAttributesToDelete(new java.util.ArrayList<String>(attributesToDelete.length));
        }
        for (String ele : attributesToDelete) {
            this.attributesToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stack attributes to delete.
     * </p>
     * 
     * @param attributesToDelete
     *        The stack attributes to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackAttribute
     */

    public UpdateStackRequest withAttributesToDelete(java.util.Collection<String> attributesToDelete) {
        setAttributesToDelete(attributesToDelete);
        return this;
    }

    /**
     * <p>
     * The stack attributes to delete.
     * </p>
     * 
     * @param attributesToDelete
     *        The stack attributes to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackAttribute
     */

    public UpdateStackRequest withAttributesToDelete(StackAttribute... attributesToDelete) {
        java.util.ArrayList<String> attributesToDeleteCopy = new java.util.ArrayList<String>(attributesToDelete.length);
        for (StackAttribute value : attributesToDelete) {
            attributesToDeleteCopy.add(value.toString());
        }
        if (getAttributesToDelete() == null) {
            setAttributesToDelete(attributesToDeleteCopy);
        } else {
            getAttributesToDelete().addAll(attributesToDeleteCopy);
        }
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStorageConnectors() != null)
            sb.append("StorageConnectors: ").append(getStorageConnectors()).append(",");
        if (getDeleteStorageConnectors() != null)
            sb.append("DeleteStorageConnectors: ").append(getDeleteStorageConnectors()).append(",");
        if (getRedirectURL() != null)
            sb.append("RedirectURL: ").append(getRedirectURL()).append(",");
        if (getAttributesToDelete() != null)
            sb.append("AttributesToDelete: ").append(getAttributesToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStackRequest == false)
            return false;
        UpdateStackRequest other = (UpdateStackRequest) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStorageConnectors() == null ^ this.getStorageConnectors() == null)
            return false;
        if (other.getStorageConnectors() != null && other.getStorageConnectors().equals(this.getStorageConnectors()) == false)
            return false;
        if (other.getDeleteStorageConnectors() == null ^ this.getDeleteStorageConnectors() == null)
            return false;
        if (other.getDeleteStorageConnectors() != null && other.getDeleteStorageConnectors().equals(this.getDeleteStorageConnectors()) == false)
            return false;
        if (other.getRedirectURL() == null ^ this.getRedirectURL() == null)
            return false;
        if (other.getRedirectURL() != null && other.getRedirectURL().equals(this.getRedirectURL()) == false)
            return false;
        if (other.getAttributesToDelete() == null ^ this.getAttributesToDelete() == null)
            return false;
        if (other.getAttributesToDelete() != null && other.getAttributesToDelete().equals(this.getAttributesToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStorageConnectors() == null) ? 0 : getStorageConnectors().hashCode());
        hashCode = prime * hashCode + ((getDeleteStorageConnectors() == null) ? 0 : getDeleteStorageConnectors().hashCode());
        hashCode = prime * hashCode + ((getRedirectURL() == null) ? 0 : getRedirectURL().hashCode());
        hashCode = prime * hashCode + ((getAttributesToDelete() == null) ? 0 : getAttributesToDelete().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStackRequest clone() {
        return (UpdateStackRequest) super.clone();
    }

}
