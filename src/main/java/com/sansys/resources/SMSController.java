/**
 * Sansys reserves all the right for this source code. 
 * You should not modify or reuse without the noticing it to sansys. 
 * And need to provide credits where applicable. 
 * Unless required by applicable law or agreed to in writing, software&#13;
 *  distributed under the License is distributed on an "AS IS" BASIS,&#13;
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.&#13;
 *  See the License for the specific language governing permissions and&#13;
 *  limitations under the License.
 */


package com.sansys.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sansys.service.SmsService;
import com.sansys.service.models.SmsRequest;

/**
 * @author Sanjeev Kulkarni
 *
 */

@RestController
@RequestMapping("/api/v1/sms")
public class SMSController {
	
	@Autowired
	private SmsService smsService;
	
	@PostMapping
	public void sendSms(@RequestBody SmsRequest smsRequest) {
		smsService.sendSms(smsRequest);
	}
}
