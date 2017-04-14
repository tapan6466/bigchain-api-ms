/**
 * 
 */
package com.pwc.bigchain.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author lokeshk025
 *
 */
@Document(collection="recognition")
public class Recognitions {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Recognitions [recognitionId=" + recognitionId + ", recognitionName=" + recognitionName + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((recognitionId == null) ? 0 : recognitionId.hashCode());
		result = prime * result + ((recognitionName == null) ? 0 : recognitionName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recognitions other = (Recognitions) obj;
		if (recognitionId == null) {
			if (other.recognitionId != null)
				return false;
		} else if (!recognitionId.equals(other.recognitionId))
			return false;
		if (recognitionName == null) {
			if (other.recognitionName != null)
				return false;
		} else if (!recognitionName.equals(other.recognitionName))
			return false;
		return true;
	}
	@Id
	private String recognitionId;
	@Field
	private String recognitionName;
	/**
	 * @return the recognitionId
	 */
	public String getRecognitionId() {
		return recognitionId;
	}
	/**
	 * @param recognitionId the recognitionId to set
	 */
	public void setRecognitionId(String recognitionId) {
		this.recognitionId = recognitionId;
	}
	/**
	 * @return the recognitionName
	 */
	public String getRecognitionName() {
		return recognitionName;
	}
	/**
	 * @param recognitionName the recognitionName to set
	 */
	public void setRecognitionName(String recognitionName) {
		this.recognitionName = recognitionName;
	}
	

}
