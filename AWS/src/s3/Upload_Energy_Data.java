/**
 * 
 */
package s3;


import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;


/**
 * @author zhichuanhuang
 *
 */
public class Upload_Energy_Data {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//start connection with my account
		AmazonS3 s3 = Connection.startConnection();
		
		String bucketName = "Energy-Data";
		
		
		try{
			
			/*
			 * if bucket exists, do nothing
			 * otherwise, create the bucket
			 */
			if(s3.doesBucketExist(bucketName)){
				
			}else{
				System.out.println("Creating bucket " + bucketName + "\n");
	            s3.createBucket(bucketName);
			}
			
            
            /*
             * get the 
             * 
             */
			
			for(){
				
				/*
				 * if the object exists, do nothing
				 * otherwise, upload the object
				 */
				if(s3.doesObjectExist(bucketName, objectName)){
					
					
				}else{
					System.out.println("Uploading a new object to S3 from a file" + "\n");
		            s3.putObject(new PutObjectRequest(bucketName, objectName, new File());
ç
					
				}
				
			}
            
			
			
			
			
		}catch(AmazonServiceException ase) {
            System.out.println("Caught an AmazonServiceException, which means your request made it "
                    + "to Amazon S3, but was rejected with an error response for some reason.");
            System.out.println("Error Message:    " + ase.getMessage());
            System.out.println("HTTP Status Code: " + ase.getStatusCode());
            System.out.println("AWS Error Code:   " + ase.getErrorCode());
            System.out.println("Error Type:       " + ase.getErrorType());
            System.out.println("Request ID:       " + ase.getRequestId());
        } catch (AmazonClientException ace) {
            System.out.println("Caught an AmazonClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with S3, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message: " + ace.getMessage());
        }
		

	}

}
