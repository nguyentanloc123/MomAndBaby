package com.example.momandbaby.Main

import android.animation.ValueAnimator
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import com.example.momandbaby.R
import com.example.momandbaby.data.AdapterData
import com.example.momandbaby.data.DataSlide
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val dataSideAdapters = AdapterData(
        listOf(
            DataSlide(
                1,
                "Cụm tế bào và nhỏ như đầu pin, qua từng ngày, nó sẽ nhân lên " +
                        "và phân chia nhanh chóng.",
                "Duy trì việc ghi chú thời gian bắt đầu và khoảng thời gian kéo dài của kỳ kinh. Điều này giúp bạn biết được chính xác độ dài của chu kỳ và cũng tính được thời điểm thụ thai dễ nhất. Khi bạn muốn có thai thì có thể ngưng các biện pháp tránh thai. Nếu bạn dùng thuốc ngừa thai thì phải mất một thời gian để cơ thể bình thường trở lại vì thuốc tránh thai làm thay đổi nội tiết tố của bạn.",
                "Bắt đầu uống các vitamin bổ sung, đặc biệt là acid folic. Lúc mới mang thai thì nên uống khoảng 500mcg/ngày và nếu có điều kiện thì nên dùng trong vòng vài tháng liền trước khi mang thai. Vì lượng acid folic thấp dễ dẫn đến các khuyết tật dây thần kinh ở thai nhi trong bụng người mẹ."
            ),
            DataSlide(
                2,
                "Trứng thụ tinh sẽ thực hiện quá trình nhân đôi vào tuần lễ thứ hai. Hợp tử bắt đầu phân chia làm 2, làm 4, làm 8 và cứ nhân đôi liên tục. Khi đến tử cung, số lượng tế bào lúc này là 32, gọi là noãn bào.",
                "Bạn hãy ra nhà thuốc hoặc siêu thị mua một hay hai que thử thai. Đắt nhất không nhất thiết có nghĩa là tốt nhất. Hãy mua loại có 2 que trong một gói để bạn có thể dùng kiểm tra 2 lần. Không thể có tình huống cho kết quả dương tính sai, mặc dù trong giai đoạn rất sớm này thì bạn có thể có kết quả âm tính giả. Và hãy giữ lại que thử, nếu nó cho kết quả dương tính, đó là sẽ một vật lưu niệm ý nghĩa về sau này.",
                "Cố gắng giữ sức khỏe và tránh bị quá nóng. Nhiệt độ cơ thể mẹ tăng cao trong những tuần đầu của thai kỳ đôi khi có thể mang lại rủi ro cho em bé vì cơ thể bé đang trong quá trình hình thành."
            ),
            DataSlide(
                3,
                "Các mẹ hãy nghĩ đây là thời điểm để xây nhà cho bé yêu ở trong bụng. Nhau thai hình thành 2 lớp nội bì và biểu bì .Lúc này, bé chỉ là một phôi thai nhỏ và bắt đầu phát triển tất cả các cơ quan, bộ phận cơ thể.",
                "Tránh dùng bất kỳ loại thuốc nào trừ khi nó hết sức cần thiết, và bạn đã được sự tư vấn của bác sĩ hoặc dược sĩ. Một số loại thuốc có hại cho sự phát triển của phôi thai.",
                "Mỗi ngày, bạn hãy nhớ uống vitamin bổ sung cho thai kỳ. Tuần thứ 3 là tuần mà ống thần kinh (não và tủy sống) của bé còn mở nhưng nó sẽ đóng vào tuần tới. Cố gắng nghỉ ngơi khi có thể. Bạn có thể sẽ cảm thấy vô cùng mệt mỏi vào giai đoạn này và cách tốt nhất để đối phó là đi ngủ, và nếu được thì cố gắng thư giãn."

            ),
            DataSlide(
                4,
                "Phôi thai đang tăng trưởng mạnh với 3 lớp: ngoại bì, trung bì, nội bì. Nó có kích thước như một hạt mè hoặc như một con nòng nọc nhỏ.",
                "Hãy dự trữ nhiều đồ ăn vặt trong túi của bạn. Bánh snack, bánh quy ngọt, và nước có thể sẽ rất cần thiết để đối phó với cơn buồn nôn." +
                        "Đừng quên dự trữ bao ni-lon hay hộp đựng đề phòng trường hợp bạn bị nôn. Không nên cảm thấy xấu hổ nếu bạn bị trước mặt người khác. Nhiều người cũng đã từng trải qua giai đoạn này và nó sẽ không nên kéo dài quá lâu.",
                "Trong tuần này, bạn cần tránh bất kỳ các độc tố, hóa chất, thuốc, tia X-quang, rượu hay nói chung là bất kỳ thói quen nào có tiềm ẩn nguy cơ cho thai nhi. Tuần thứ 4 là thời điểm quan trọng đối với sự thay đổi và phát triển của thai nhi.\n" +
                        "Không nên lo lắng nếu bạn bị giảm cân trong tuần này. Tình trạng khó chịu và nôn mửa có thể dẫn đến giảm cân và bạn sẽ có nhiều thời gian để lấy lại trọng lượng, và còn phát triển to hơn nữa trong những tuần sau của thai kỳ."

            ),
            DataSlide(
                5,
                "Đến thời điểm này, các mẹ hãy vui mừng đi nhé vì thai nhi đã có kích thước bằng một hạt đậu nhỏ rồi đấy! Quan trọng là các bộ phận mắt, mũi, miệng và tai bắt đầu hình thành. Các bác sĩ có thể đo được trong tuần này nhịp tim bé đập từ 100 – 160 lần/phút",
                "Bạn nên hẹn lịch khám với nha sĩ. Vệ sinh răng miệng kém và các bệnh về nướu có liên quan tới việc sinh non cũng như một số rủi ro thai kỳ khác. Hãy trao đổi với nha sĩ về việc làm thế nào để giữ vệ sinh răng miệng tốt nhất trong suốt thai kỳ",
                "•\tNên cân nhắc việc ăn nhiều gừng hơn. Nhiều người cho rằng bánh quy gừng, bia gừng hoặc kẹo gừng có thể giúp giải quyết cảm giác buồn nôn. Nên chia nhỏ bữa ăn, và tránh để các bữa ăn cách nhau quá lâu. Đừng lo lắng nếu bạn không thể chịu được trà hay cà phê vào giai đoạn này. Rất nhiều chị em nói rằng đây là món đầu tiên trong rất nhiều món mà họ không thích trong suốt thai kỳ. Thay vào đó, hãy thử trà thảo dược hoặc bạc hà, hay đơn giản là nước lạnh. "

            ),
            DataSlide(
                6,
                "Các túi mắt dần phát triển thành mắt, ống thần kinh dọc theo lưng đóng kín, phần đầu của hệ hô hấp và bộ máy tiêu hóa được hình thành. Bạn có tò mò muốn biết “bé yêu” bây giờ dài bao nhiêu không? Theo ước tính, tổng chiều dài của bé vỏn vẹn 2 – 4 mm.",
                "•\tNên chọn áo ngực thoải mái hơn phù hợp với vòng một đang lớn lên của bạn. Tuy nhiên vẫn còn sớm để mặc áo ngực bà bầu hay loại áo cho con bú. " +
                        "Tránh những công việc phải chạy ngược chạy xuôi suốt ngày từ sáng đến tối. Không nên ôm đồm quá nhiều việc, và hãy nghỉ ngơi khi bạn cảm thấy mệt mỏi.",
                "•\tHãy tìm hiểu kỹ để chọn bác sĩ để chăm sóc và theo dõi sức khỏe cho bạn trong suốt thai kỳ. Bạn nên trao đổi thêm với những người thân, người bạn đã từng có con; đọc thêm những thông tin bạn cần tham khảo, và bàn bạc với chồng để anh ấy cùng đưa ra ý kiến quyết định."
            ),
            DataSlide(
                7,
                "Đến bây giờ, thai nhi cân nặng khoảng 0.8g và dài khoảng 13mm. Cơ thể bé hình thành dây rốn để bắt đầu quá trình thu nhận dưỡng chất và thải những chất bẩn ra ngoài môi trường túi ối. Đồng thời, các chồi tay tách rõ hai phần rõ rệt vai và cánh tay.",
                "Bạn nên bắt đầu tìm lớp dành cho các bà mẹ tương lai. Có thể cần phải đặt trước và có thể còn bị xếp trong danh sách chờ nữa." +
        "Hãy nghĩ đến việc đăng ký một lớp yoga dành cho bà mẹ mang thai hay một hình thức vân động nào khác tương tự trong khu vực gần nhà bạn ở.",
                "•\tchuyển sang một môn thể dục khác nhẹ nhàng hơn. Những hình thức thể dục thể thao tạo chấn động liên tục như thế này không hề tốt cho thai nhi. Vẫn còn nhiều cách vận động khác nhẹ nhàng phù hợp hơn với bạn trong giai đoạn này."
            ),
            DataSlide(
                8,
                "Kích thước lúc này của bé dài khoảng 2.5 cm, chỉ nặng vài gam và có hình dang như quả nho Mỹ",
                "•\tHãy thử uống trà thảo dược thay cho trà và cà phê có chất caffeine thường ngày của bạn. Thường thì các loại trà này tốt hơn cho sức khỏe và thay thế rất dễ dàng cho các thức uống nóng vốn khơi nguồn cảm hứng cho bạn.",
                "•\tCố gắng uống nhiều sữa và canxi hơn trong tuần này. Chân răng của em bé đã được hình thành, vậy nên bất kỳ loại thức ăn nào chứa dưỡng chất quan trọng này đều có tác động tích cực đối với răng em bé. Cố gắng tránh để bị nhiễm trùng trong tuần này, bởi nhiễm trùng có thể làm tăng nhiệt độ cơ thể bạn, làm ảnh hưởng xấu đến sự phát triển của răng em bé."
            ),
            DataSlide(
                9,
                "Một điều thú vị vào tuần thứ 9, trên ngực của bé xuất hiện núm vú, cơ quan sinh dục tiếp tục phát triển. Nếu như trước đây, bé nằm như hình chữ C thì giờ đã thẳng hơn một chút",
                "Nếu bạn chưa đi khám thai lần thứ nhất, thì bây giờ là lúc phải đi. Chọn một thời điểm nào đó bố em bé có thể đi cùng, và cố gắng nghỉ làm việc hẳn vài tiếng sau đó để bạn có thể nói chuyện về buổi khám đầu tiên đó",
                "•\tHãy bắt đầu để dành tiền cho những tháng nghỉ việc để sinh con. Việc có kế hoạch tiết kiệm chắn chắn cho khi nghỉ sinh sẽ giúp bạn giảm căng thẳng khi phải nghỉ việc một thời gian. Điều này đặc biệt quan trọng nếu có những chuyện không ngờ xảy ra, và bạn phải nghỉ việc sớm hơn dự định."

            ),
            DataSlide(
                10,
                "Điều đặc biệt cần chú ý là não bộ của bé trong tuần này phát triển rất nhanh. Các chuyên gia ước tính có khoảng 250.000 tế bào thần kinh mới được sinh ra mỗi phút. Trong tuần thai này, bé dài khoảng 4cm",
                "Không chơi các môn thể thao nguy hiểm, cần nhiều sức lực và tăng nguy cơ làm giảm lượng oxy cung cấp cho bé như lặn, leo núi, du lịch đến những vùng cao …; tốt hơn hết bạn nên vận động vừa phải",
                "•\tThận trọng với các thực phẩm có thể gây nguy hiểm cho bạn và thai nhi. Listeria là loại nhiễm khuẩn từ thực phẩm có thể gây nguy hiểm cho thai phụ và thai nhi."

            ),
            DataSlide(11,
                "Chiều dài của bé dài khoảng 5cm tính từ đầu đến chóp mông, trọng lượng khoảng 15g. Đầu của bé đến thời điểm này vẫn rất to so với cơ thể, chiếm 1/2 chiều dài thân mình của bé. Những ngón tay đã biết xòe ra và nắm lại, ngón chân co lại.",
                "Từ tuần thứ 11 cuả thai kỳ, do sự gia tăng lưu lượng máu qua niêm mạc mũi, các thai phụ thường dễ mắc các chứng bệnh nghẹt mũi, chảy máu cam và ù tai. Vì vậy, bạn hãy mang theo nhiều khăn giấy bên mình để dùng khi cần thiết.",
                "Cần đảm bảo cân bằng dinh dưỡng trong chế độ ăn hàng ngày. Mức tăng cân lý tưởng trong thời kỳ mang thai là từ 10-12 kg. Bạn nên chú trọng đến chất lượng hơn là số lượng thực phẩm. Kiểm soát cân nặng hợp lý và cần thận trọng trong việc lựa chọn các loại thức ăn hàng ngày."

            ),
            DataSlide(
                12,
                "Từ tuần 11 đến tuần 12 thai kỳ, thai nhi có sự tăng trưởng vượt bậc. Đến tuần này, bé bắt đầu dài khoảng 5.3 cm tính từ đầu đến mông, nặng khoảng 28g.",
                "•\tKhi thấy đói, bạn nên ăn ngay. Đến lúc này thì cảm giác hứng thú với chuyện ăn uống đã trở lại với bạn. Hãy đãm bảo bạn luôn có nhiều thức ăn vặt lành mạnh bên mình, và không nên nghĩ đến việc ăn kiêng. Đây không phải là thời gian để bạn giảm cân.",
                "Đừng quên chất xơ! Trái cây và rau củ là rất cần thiết vì chúng giúp tránh các vấn đề về đường ruột. Chất xơ phải cần có nước thì mới phát huy tác dụng"

            ),
            DataSlide(
                13,
                "Ở tuần thứ 13, chiều dài của bé đạt 9cm, nặng khoảng 43g. Qua hình ảnh siêu âm, mẹ có thể thây “thiên thần” của mình như một quả táo",
                "Cố gắng tránh để bị nhiễm trùng đường tiết niệu. Đây là một tình trạng phổ biến trong thai kỳ, và mặc dù không phải là một vấn đề lớn, nó vẫn có thể gây nhiều phiền toái hơn là chỉ khó chịu chút chút",
                "Hãy uống nhiều nước, và sau khi đi tiểu thì nên lau sạch từ từ trước ra sau. Nên làm trống bàng quang trước và sau khi quan hệ tình dục. Trường hợp bạn bị tiểu rát hay có mùi, hãy đi bác sĩ để được kiểm tra sớm."

            ),
            DataSlide(
                14,
                "Tuần này, mỗi khi có ánh sáng mạnh chiếu xuyên qua thành bụng, các cơ kiểm soát mắt của bé bắt đầu làm việc",
                "•\tNếu bạn mang thai đúng vào những tháng bệnh cúm phổ biến thì hãy nghĩ đến việc chủng ngừa. Vắc-xin sẽ không có hại cho thai nhi, và có tác dụng bảo vệ phụ nữ mang thai.\n" +
                        "Bạn có thể muốn chụp để lưu lại một loạt hình ảnh mang thai của mình, để xem bụng mình phát triển ra sao trong vài tháng tới. Đây chắc chắn sẽ là một kỷ niệm đẹp",
                "Nếu bạn đã có những đứa con lớn thì lúc này là thời gian để nói với chúng về em bé sắp ra đời. Chẳng bao lâu nữa các anh chị sẽ có thể nhận ra em bé đang đá hoặc di chuyển trong bụng mẹ"
            ),
            DataSlide(
                15,
                "Vì làn da của bé vẫn còn mờ mờ nên qua hình ảnh siêu âm, chúng ta có thể nhìn thấy những mạch máu bên trong. Đến thời điểm này, các ông bố bà mẹ sẽ thỏa nỗi mong chờ và hồi hộp không biết con của mình là trai hay gái. Qua màn hình siêu âm, chúng ta có thể xác định rõ giới tính của bé.",
                "•\tCố gắng tránh đứng lên quá nhanh nếu bạn đã ngồi trong một thời gian lâu. Huyết áp sẽ có một khoảng hụt tự động khi bạn đang nằm hoặc ngồi và đứng lên đột ngột, có thể gây ra chóng mặt hay ngất xỉu. Hãy đứng lên từ từ cho cơ thể bạn có đủ thời gian để điều chỉnh.",
                "Hãy giữ gìn vệ sinh cẩn thận nếu bạn dễ bị nổi mẩn, đặc biệt ở vùng háng, dưới hai bên ngực, và vùng nách- những nơi có da cọ xát với nhau và thường bị nóng nực. Bạn nên tắm và thay đồ lót thường hơn. Chất liệu cotton vẫn là thích hợp nhất vì nó thấm mồ hôi và giúp da dễ thở hơn"
            ),
            DataSlide(
                16,
                "Cân nặng của “cục cưng” nhà bạn lúc này đạt khoảng 80g, chiều dài khoảng 116 mm. Thai nhi đã biết giữ cho đầu mình luôn thẳng đứng. Cơ mặt bắt đầu biểu hiện rõ nét hơn, nheo mắt hoặc cau mày lại. Canxi tiếp tục được cung cấp cho xương để phát triển.",
                "Hầu hết các bà mẹ mang thai đều nên siêu âm từ tuần thứ 16. Hãy hẹn với bác sĩ một ngày mà chồng bạn có thể đi cùng bạn. Và đừng quên lưu lại những hình ảnh đầu tiên của thai nhi để khi lớn lên, bé càng cảm nhận thêm tình yêu của mẹ và bố dành cho bé từ những ngày còn trong bụng mẹ.",
                "Bia, rượu và các chất có cồn không tốt cho phụ nữ mang thai và cách an toàn nhất là bạn hãy kiêng tất cả những thứ độc hại này. Thay vào đó, hãy uống nhiều nước hoa quả, nước khoáng và soda, hoặc nước đun sôi để nguội với một ít chanh."
            ),
            DataSlide(
                17,
                "Đến tuần thai này, bạn đừng lo sợ bé sẽ bị lạnh sau khi sinh ra nhé! Bởi lớp mỡ đang được hình thành và tích lũy để giữ ấm cho bé. Chiều dài thai nhi đo được trong tuần khoảng 12cm, nặng khoảng 100g.",
                "Nếu bạn chưa hẹn lịch siêu âm thai thì đây là thời điểm rất thích hợp. Siêu âm giữa thai kỳ có thể diễn ra từ tuần 18 đến tuần 22 để kiểm tra sự phát triển của thai nhi bao gồm sự hình thành và phát triển bộ não, tim, cột sống, gan, thận, và các cơ quan nội tạng khác. ",
                "Hãy thường xuyên trò chuyện với bé từ lúc còn trong bụng mẹ. Từ tuần thứ 17, bé đã có thể nghe và phân biệt được giọng nói của bạn. Hãy rủ ông xã cùng tận hưởng cảm giác sung sướng khi nhận thấy những chuyển động cuả bé."
            ),
            DataSlide(
                18,
                "Bé đã bắt đầu tiến hành gập chân và tay rồi các mẹ nhé! Từ bây giờ đến sắp tới, mẹ bầu sẽ cảm nhận những chuyển động này rõ hơn. Tay chân của bé cân đối hơn, tóc trên da đầu bắt đầu mọc, thận tiếp tục lọc nước tiểu. Điều đáng vui mừng là bé có thể nghe được giọng nói của mẹ",
                "Nếu bạn lo lắng vì mắc phải bệnh giãn tĩnh mạch, hãy thường xuyên mang vớ cho bà bầu để hỗ trợ đôi chân và nâng đỡ phần bụng dưới. Tranh thủ nghĩ ngơi, thả lỏng chân tay khi có thể và tránh đứng quá lâu. ",
                "Đảm bảo chế độ ăn nhiều chất xơ và uống nhiều nước sẽ giúp bạn xoá tan nỗi lo bệnh trĩ. Chất xơ có nhiều trong các loại đậu, ngũ cốc, rau và trái cây. Ngoài ra, bạn không nên cố nhịn khi có nhu cầu đi vệ sinh nếu không về lâu về dài sẽ gây ra những chứng bệnh không đáng có."

            ),
            DataSlide(
                19,
                "Hình dáng thai nhi lúc này như một trái xoài, dài khoảng 16.5 – 25.5 cm, nặng chừng 300g.",
                "Hãy đi chơi thư giãn. Đây chính là thời điểm có thể nghĩ đến chuyện tạm nghỉ ngơi trước khi sinh, và vì cơ thể chưa nặng nề nên bạn vẫn có thể đi du lịch",
                ""
            ),
            DataSlide(
                20,
                "Những phản xạ tiếp tục hình thành và phát triển: bé nắm chặt dây rốn, ngậm ngón tay cái và kể cả nấc cục. Làn da đã có lớp mỡ xuất hiện ở lớp dưới nên không còn trong suốt như thời gian trước nữa.",
                "Nếu bạn đã có con đầu đang tuổi tập đi, bạn chỉ cần cúi xuống với trẻ chứ đừng bế trẻ thường xuyên. Khuyến khích trẻ leo vào lòng khi bạn đang ngồi hoặc đang nằm. Phụ nữ mang thai thường hay bị đau lưng, do vậy bạn cần chú ý chăm sóc cho lưng mình",
                "Hãy đi chơi thư giãn. Đây chính là thời điểm có thể nghĩ đến chuyện tạm nghỉ ngơi trước khi sinh, và vì cơ thể chưa nặng nề nên bạn vẫn có thể đi du lịch"

               )
//                ,
//            DataSlide(
//                21
//            ),
//            DataSlide(
//                22
//            ),
//            DataSlide(
//                23
//            ),
//            DataSlide(
//                34
//            ),
//            DataSlide(
//                25
//            ),
//            DataSlide(
//                26
//            ),
//            DataSlide(
//                27
//            ),
//            DataSlide(
//                28
//            ),DataSlide(
//                29
//            ),
//            DataSlide(
//                30
//            ),
//            DataSlide(
//                31
//            ),
//            DataSlide(
//                32
//            ),
//            DataSlide(
//                33
//            ),
//            DataSlide(
//                34
//            ),
//            DataSlide(
//                35
//            ),
//            DataSlide(
//                36
//            ),
//            DataSlide(
//                37
//            ),
//            DataSlide(
//                38
//            ),
//            DataSlide(
//                39
//            )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter= dataSideAdapters
        viewpager.currentItem= 1


    }
    @Override
    fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        var heightMeasureSpec = heightMeasureSpec
        if (viewpager == null) {

            return
        }
        var height = 0
        viewpager.measure(
            widthMeasureSpec,
            View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
        )
        val h: Int = viewpager.getMeasuredHeight()
        if (h > height) height = h
        heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(height, View.MeasureSpec.EXACTLY)

    }

}



