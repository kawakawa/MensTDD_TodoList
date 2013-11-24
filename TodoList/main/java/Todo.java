import java.util.Date;

public class Todo {
	public Date creationTime;
	public Date limitTime;
	public Boolean status = false;
	public String action;
	
	public Todo(String action) {
		this.action = action;
		this.status = false;
		this.creationTime = new Date();
		this.limitTime = null;
	}

	@Override
	public String toString() {
		return "{creationTime:" + creationTime + ", limitTime:"
				+ limitTime + ", status:" + status + ", action:" + action + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result
				+ ((creationTime == null) ? 0 : creationTime.hashCode());
		result = prime * result
				+ ((limitTime == null) ? 0 : limitTime.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (creationTime == null) {
			if (other.creationTime != null)
				return false;
		} else if (!creationTime.equals(other.creationTime))
			return false;
		if (limitTime == null) {
			if (other.limitTime != null)
				return false;
		} else if (!limitTime.equals(other.limitTime))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
		
	
}
