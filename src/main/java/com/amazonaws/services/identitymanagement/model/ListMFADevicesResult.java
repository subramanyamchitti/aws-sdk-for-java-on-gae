/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

/**
 * <p>
 * Contains the result of a successful invocation of the ListMFADevices
 * action.
 * </p>
 */
public class ListMFADevicesResult {

    /**
     * A list of MFA devices.
     */
    private java.util.List<MFADevice> mFADevices;

    /**
     * A flag that indicates whether there are more User names to list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more User names in the list.
     */
    private Boolean isTruncated;

    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     */
    private String marker;

    /**
     * A list of MFA devices.
     *
     * @return A list of MFA devices.
     */
    public java.util.List<MFADevice> getMFADevices() {
        if (mFADevices == null) {
            mFADevices = new java.util.ArrayList<MFADevice>();
        }
        return mFADevices;
    }
    
    /**
     * A list of MFA devices.
     *
     * @param mFADevices A list of MFA devices.
     */
    public void setMFADevices(java.util.Collection<MFADevice> mFADevices) {
        java.util.List<MFADevice> mFADevicesCopy = new java.util.ArrayList<MFADevice>();
        if (mFADevices != null) {
            mFADevicesCopy.addAll(mFADevices);
        }
        this.mFADevices = mFADevicesCopy;
    }
    
    /**
     * A list of MFA devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mFADevices A list of MFA devices.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMFADevicesResult withMFADevices(MFADevice... mFADevices) {
        for (MFADevice value : mFADevices) {
            getMFADevices().add(value);
        }
        return this;
    }
    
    /**
     * A list of MFA devices.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mFADevices A list of MFA devices.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMFADevicesResult withMFADevices(java.util.Collection<MFADevice> mFADevices) {
        java.util.List<MFADevice> mFADevicesCopy = new java.util.ArrayList<MFADevice>();
        if (mFADevices != null) {
            mFADevicesCopy.addAll(mFADevices);
        }
        this.mFADevices = mFADevicesCopy;

        return this;
    }
    
    /**
     * A flag that indicates whether there are more User names to list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more User names in the list.
     *
     * @return A flag that indicates whether there are more User names to list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more User names in the list.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more User names to list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more User names in the list.
     *
     * @param isTruncated A flag that indicates whether there are more User names to list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more User names in the list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more User names to list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more User names in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more User names to list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more User names in the list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMFADevicesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    
    
    /**
     * A flag that indicates whether there are more User names to list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more User names in the list.
     *
     * @return A flag that indicates whether there are more User names to list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more User names in the list.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListMFADevicesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("MFADevices: " + mFADevices + ", ");
        sb.append("IsTruncated: " + isTruncated + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    