public class JobCategory {

    //fields
    private String categoryName_Persian = "null";
    private String categoryName_English = "null";
    private String postName_Persian = "null";
    private String postName_English = "null";

    //system
    private String JobCategorySerialCode = "null";

    public String getJobCategorySerialCode() {
        return JobCategorySerialCode;
    }

    public void setJobCategorySerialCode(String jobCategorySerialCode) {
        JobCategorySerialCode = jobCategorySerialCode;
    }

    public String getCategoryName_Persian() {
        return categoryName_Persian;
    }

    public void setCategoryName_Persian(String categoryName_Persian) {
        this.categoryName_Persian = categoryName_Persian;
    }

    public String getCategoryName_English() {
        return categoryName_English;
    }

    public void setCategoryName_English(String categoryName_English) {
        this.categoryName_English = categoryName_English;
    }

    public String getPostName_Persian() {
        return postName_Persian;
    }

    public void setPostName_Persian(String postName_Persian) {
        this.postName_Persian = postName_Persian;
    }

    public String getPostName_English() {
        return postName_English;
    }

    public void setPostName_English(String postName_English) {
        this.postName_English = postName_English;
    }

    @Override
    public String toString() {
        return "JobCategory{" +
                "categoryName_Persian='" + categoryName_Persian + '\'' +
                ", categoryName_English='" + categoryName_English + '\'' +
                ", postName_Persian='" + postName_Persian + '\'' +
                ", postName_English='" + postName_English + '\'' +
                ", JobCategorySerialCode='" + JobCategorySerialCode + '\'' +
                '}';
    }
}