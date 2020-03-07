package com.example.momandbaby.Main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.momandbaby.Music.MusicActivity
import com.example.momandbaby.R
import com.example.momandbaby.SettingActivity
import com.example.momandbaby.data.AdapterData
import com.example.momandbaby.data.DataSlide
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val dataSideAdapters = AdapterData(
        listOf(
            DataSlide(
                2,
                1,
                "Tuần đầu tiên của thai kỳ còn nằm trong chu kỳ kinh nguyệt. Hầu hết các chị em đều không biết mình đang mang thai cho đến khi vắng kinh và dùng que thử thai hiện “hai vạch”. Lúc này, thai nhi chỉ là một cụm tế bào và nhỏ bằng đầu pin. Qua từng ngày, nó sẽ nhân lên và phân chia nhanh chóng.\n",
                "Duy trì việc ghi chú thời gian bắt đầu và khoảng thời gian kéo dài của kỳ kinh. Điều này giúp bạn biết được chính xác độ dài của chu kỳ và cũng tính được thời điểm thụ thai dễ nhất. Khi bạn muốn có thai thì có thể ngưng các biện pháp tránh thai. Nếu bạn dùng thuốc ngừa thai thì phải mất một thời gian để cơ thể bình thường trở lại vì thuốc tránh thai làm thay đổi nội tiết tố của bạn.\n Bắt đầu uống các vitamin bổ sung, đặc biệt là acid folic. Lúc mới mang thai thì nên uống khoảng 500mcg/ngày và nếu có điều kiện thì nên dùng trong vòng vài tháng liền trước khi mang thai. Vì lượng acid folic thấp dễ dẫn đến các khuyết tật dây thần kinh ở thai nhi trong bụng người mẹ.\n" +
        "Cố gắng giữ gìn sức khỏe và hoạt động đều đặn bằng việc tập thể dục và ăn uống hợp lý. Đi khám sức khỏe để chắc chắn rằng bạn có một thể trang đủ tốt cho việc mang thai. Việc béo phì, hút thuốc lá, sử dụng thuốc hay nói chung là lối sống không lành mạnh sẽ ảnh hưởng hoặc làm chậm có thai.\n" +
        "•\tBạn hãy kiểm tra kỹ việc chích ngừa nữa để chắc chắn cho sự an toàn của bạn và đảm bảo con bạn cũng được bảo vệ. \n" +
        "Hãy cố gắng không dùng thuốc tây trừ khi có sự chỉ định của bác sĩ. Bởi lẽ một số dược chất sẽ có hại cho phôi thai đặc biệt là trong những tuần đầu tiên.\n"
            ),
            DataSlide(
                     R.drawable.t1,
                2,
"Trứng thụ tinh sẽ thực hiện quá trình nhân đôi vào tuần lễ thứ hai. Hợp tử bắt đầu phân chia làm 2, làm 4, làm 8 và cứ nhân đôi liên tục khi di chuyển từ vòi trứng đến tử cung. Khi đến tử cung, số lượng tế bào lúc này là 32, gọi là noãn bào.\n",
"Bạn hãy ra nhà thuốc hoặc siêu thị mua một hay hai que thử thai. Đắt nhất không nhất thiết có nghĩa là tốt nhất. Hãy mua loại có 2 que trong một gói để bạn có thể dùng kiểm tra 2 lần. Không thể có tình huống cho kết quả dương tính sai, mặc dù trong giai đoạn rất sớm này thì bạn có thể có kết quả âm tính giả. Và hãy giữ lại que thử, nếu nó cho kết quả dương tính, đó là sẽ một vật lưu niệm ý nghĩa về sau này.\n" +
                "Cố gắng giữ sức khỏe và tránh bị quá nóng. Nhiệt độ cơ thể mẹ tăng cao trong những tuần đầu của thai kỳ đôi khi có thể mang lại rủi ro cho em bé vì cơ thể bé đang trong quá trình hình thành.\n"            ),
            DataSlide(
                R.drawable.t2,
                3,
"Các mẹ hãy nghĩ đây là thời điểm để xây nhà cho bé yêu ở trong bụng. Nhau thai hình thành 2 lớp nội bì và biểu bì, các tế bào của nhau thai bắt đầu tạo đường nối vào niêm mạc tử cung. Mục đích của việc này là để tạo đường dẫn cho máu mang oxy và cung cấp dinh dưỡng cho bé. Lúc này, bé chỉ là một phôi thai nhỏ và bắt đầu phát triển tất cả các cơ quan, bộ phận cơ thể.\n",
"•\tMỗi ngày, bạn hãy nhớ uống vitamin bổ sung cho thai kỳ. Tuần thứ 3 là tuần mà ống thần kinh (não và tủy sống) của bé còn mở nhưng nó sẽ đóng vào tuần tới.\n" +
        "•\tTránh dùng bất kỳ loại thuốc nào trừ khi nó hết sức cần thiết, và bạn đã được sự tư vấn của bác sĩ hoặc dược sĩ. Một số loại thuốc có hại cho sự phát triển của phôi thai.\n" +
        "•\tCố gắng nghỉ ngơi khi có thể. Bạn có thể sẽ cảm thấy vô cùng mệt mỏi vào giai đoạn này và cách tốt nhất để đối phó là đi ngủ, và nếu được thì cố gắng thư giãn.\n" +
        "\n"
            ),
            DataSlide(
                R.drawable.t3,
                4,
"Phôi thai đang tăng trưởng mạnh với 3 lớp: ngoại bì, trung bì, nội bì. Nó có kích thước như một hạt mè hoặc như một con nòng nọc nhỏ.\n" +
        "\n" +
        "– Ở lớp ngoại bì hình thành nên não bộ, tủy sống, dây thần kinh, xương sống, da, tóc, móng, mồ hôi, men răng của bé.\n" +
        "\n" +
        "– Lớp trung bì ở giữa hình thành nên tim và hệ tuần hoàn. Quả tim bắt đầu phân chia ngăn, bơm máu và đập những nhịp đầu tiên. Ngoài ra, ở tầng này cơ thể bé cũng xuất hiện sụn, xương, cơ bắp và mô dưới da.\n" +
        "\n" +
        "– Lớp nội bì là nhà của phổi, ruột, tuyến giáp gan, tuyến tụy và hệ thống tiết niệu thô sơ.\n" ,
"Hãy dự trữ nhiều đồ ăn vặt trong túi của bạn. Bánh snack, bánh quy ngọt, và nước có thể sẽ rất cần thiết để đối phó với cơn buồn nôn.\n" +
        "Đừng quên dự trữ bao ni-lon hay hộp đựng đề phòng trường hợp bạn bị nôn. Không nên cảm thấy xấu hổ nếu bạn bị trước mặt người khác. Nhiều người cũng đã từng trải qua giai đoạn này và nó sẽ không nên kéo dài quá lâu.\n" +
        "Trong tuần này, bạn cần tránh bất kỳ các độc tố, hóa chất, thuốc, tia X-quang, rượu hay nói chung là bất kỳ thói quen nào có tiềm ẩn nguy cơ cho thai nhi. Tuần thứ 4 là thời điểm quan trọng đối với sự thay đổi và phát triển của thai nhi.\n" +
        "Không nên lo lắng nếu bạn bị giảm cân trong tuần này. Tình trạng khó chịu và nôn mửa có thể dẫn đến giảm cân và bạn sẽ có nhiều thời gian để lấy lại trọng lượng, và còn phát triển to hơn nữa trong những tuần sau của thai kỳ.\n"
            ),
            DataSlide(
                R.drawable.t4,
                5,
"Đến thời điểm này, các mẹ hãy vui mừng đi nhé vì thai nhi đã có kích thước bằng một hạt đậu nhỏ rồi đấy! Quan trọng là các bộ phận mắt, mũi, miệng và tai bắt đầu hình thành. Các bác sĩ có thể đo được trong tuần này nhịp tim bé đập từ 100 – 160 lần/phút. Con số này gần gấp đôi nhịp tim người lớn. Điều này chứng tỏ máu đang lưu thông dễ dàng khắp cơ thể bé.\n",
                "•\tBạn nên hẹn lịch khám với nha sĩ. Vệ sinh răng miệng kém và các bệnh về nướu có liên quan tới việc sinh non cũng như một số rủi ro thai kỳ khác. Hãy trao đổi với nha sĩ về việc làm thế nào để giữ vệ sinh răng miệng tốt nhất trong suốt thai kỳ. Và hãy luôn nhớ cho biết bạn đang mang thai, vì chụp X-quang luôn có thể gây rủi ro tại bất kỳ giai đoạn nào của thai kỳ.\n" +
                "•\tNên cân nhắc việc ăn nhiều gừng hơn. Nhiều người cho rằng bánh quy gừng, bia gừng hoặc kẹo gừng có thể giúp giải quyết cảm giác buồn nôn. Nên chia nhỏ bữa ăn, và tránh để các bữa ăn cách nhau quá lâu. Đừng lo lắng nếu bạn không thể chịu được trà hay cà phê vào giai đoạn này. Rất nhiều chị em nói rằng đây là món đầu tiên trong rất nhiều món mà họ không thích trong suốt thai kỳ. Thay vào đó, hãy thử trà thảo dược hoặc bạc hà, hay đơn giản là nước lạnh. \n" +
             "•\tHãy cất bớt các thức ăn vặt mặn (nhiều muối) và thay vào đó các loại dùng để phết bánh mì. Số đông chị em hay thèm mặn và chua vào thời điểm này, nhưng nếu cứ ăn vặt liên tục thì có thể còn hơn một bữa ăn chính, mà lại không có nhiều dinh dưỡng. Thay vào đó, để ăn vặt, bạn hãy chọn một món phết giàu vitamin nhóm B và có giá trị dinh dưỡng hơn là chỉ đường mà thôi.\n"
            ),
            DataSlide(
                R.drawable.t5,
                6,
                "Các túi mắt dần phát triển thành mắt, ống thần kinh dọc theo lưng đóng kín, phần đầu của hệ hô hấp và bộ máy tiêu hóa được hình thành. Bạn có tò mò muốn biết “bé yêu” bây giờ dài bao nhiêu không? Theo ước tính, tổng chiều dài của bé vỏn vẹn 2 – 4 mm.",
              "Nên chọn áo ngực thoải mái hơn phù hợp với vòng một đang lớn lên của bạn. Tuy nhiên vẫn còn sớm để mặc áo ngực bà bầu hay loại áo cho con bú.  Tránh những công việc phải chạy ngược chạy xuôi suốt ngày từ sáng đến tối. Không nên ôm đồm quá nhiều việc, và hãy nghỉ ngơi khi bạn cảm thấy mệt mỏi. Hãy cân nhắc việc mua một chiếc gối hỗ trợ dành cho bà bầu để sử dung luôn cho đến khi bạn sinh bé. Loại gối hình chữ nhật, dài, sẽ có thể hỗ trợ tuyệt vời cho chiếc bụng ngày càng to ra của bạn, và giúp giảm thiểu các cơn đau lưng. Hãy tìm hiểu kỹ để chọn bác sĩ để chăm sóc và theo dõi sức khỏe cho bạn trong suốt thai kỳ. Bạn nên trao đổi thêm với những người thân, người bạn đã từng có con; đọc thêm những thông tin bạn cần tham khảo, và bàn bạc với chồng để anh ấy cùng đưa ra ý kiến quyết định."
            ),
            DataSlide(
                R.drawable.t6,
                7,
                "Đến bây giờ, thai nhi cân nặng khoảng 0.8g và dài khoảng 13mm. Cơ thể bé hình thành dây rốn để bắt đầu quá trình thu nhận dưỡng chất và thải những chất bẩn ra ngoài môi trường túi ối. Đồng thời, các chồi tay tách rõ hai phần rõ rệt vai và cánh tay.",
"Bạn nên bắt đầu tìm lớp dành cho các bà mẹ tương lai. Có thể cần phải đặt trước và có thể còn bị xếp trong danh sách chờ nữa. Hãy nghĩ đến việc đăng ký một lớp yoga dành cho bà mẹ mang thai hay một hình thức vân động nào khác tương tự trong khu vực gần nhà bạn ở. Đây cũng là cách rất hay để gặp gỡ những thai phụ khác và xây dựng một mạng lưới những người bạn mới có thể hỗ trợ nhau về sau. Nếu bạn vốn là người thường xuyên chạy bộ, hãy nghĩ đến việc chuyển sang một môn thể dục khác nhẹ nhàng hơn. Những hình thức thể dục thể thao tạo chấn động liên tục như thế này không hề tốt cho thai nhi. Vẫn còn nhiều cách vận động khác nhẹ nhàng phù hợp hơn với bạn trong giai đoạn này."
            ),
            DataSlide(
                R.drawable.t7,
                8,
"Kích thước lúc này của bé dài khoảng 2.5 cm, chỉ nặng vài gam và có hình dang như quả nho Mỹ. Tim của bé chính thức phân thành 4 ngăn và hình thành các van tim. Đến lúc này phôi thai đã hoàn toàn biến mất. Đặc biệt vào tuần thứ 8 thai kỳ, cơ quan sinh dục bắt đầu xuất hiện. Tuy nhiên chúng ta vẫn chưa thể phân biệt được giới tính tại thời điểm này.",                
"Hãy thử uống trà thảo dược thay cho trà và cà phê có chất caffeine thường ngày của bạn. Thường thì các loại trà này tốt hơn cho sức khỏe và thay thế rất dễ dàng cho các thức uống nóng vốn khơi nguồn cảm hứng cho bạn. Cố gắng uống nhiều sữa và canxi hơn trong tuần này. Chân răng của em bé đã được hình thành, vậy nên bất kỳ loại thức ăn nào chứa dưỡng chất quan trọng này đều có tác động tích cực đối với răng em bé. Cố gắng tránh để bị nhiễm trùng trong tuần này, bởi nhiễm trùng có thể làm tăng nhiệt độ cơ thể bạn, làm ảnh hưởng xấu đến sự phát triển của răng em bé. Luôn giữ các loại thức ăn vặt quanh mình phòng những lúc bạn cảm thấy chóng mặt. Chính vì có thể bạn đang ăn uống rất khó khăn, nên huyết áp của bạn thi thoảng sẽ xuống rất thấp. Đừng đứng dậy quá nhanh nếu bạn đã ngồi hơi lâu. Hãy để cho cơ thể có thời gian điều chỉnh huyết áp khi bạn chuyển từ tư thế ngồi sang tư thế đứng."
            ),
            DataSlide(
                R.drawable.t8,
                9,
                "Một điều thú vị vào tuần thứ 9, trên ngực của bé xuất hiện núm vú, cơ quan sinh dục tiếp tục phát triển. Nếu như trước đây, bé nằm như hình chữ C thì giờ đã thẳng hơn một chút. Bạn có thể thấy bé có bắt đầu có nét giống người bình thường, núm vú xuất hiện trên ngực và hai tai đã nằm đúng chổ trên cơ thể.",
                "Nếu bạn chưa đi khám thai lần thứ nhất, thì bây giờ là lúc phải đi. Chọn một thời điểm nào đó bố em bé có thể đi cùng, và cố gắng nghỉ làm việc hẳn vài tiếng sau đó để bạn có thể nói chuyện về buổi khám đầu tiên đó. Có thể bạn sẽ trở nên vô cùng phấn khích khi nghe được nhịp tim em bé rất rõ ràng bằng máy siêu âm. Đừng quên đánh răng! Vệ sinh răng miệng lúc nào cũng quan trọng, và trong thời gian mang thai lại càng quan trọng hơn bao giờ hết. Bạn cũng hãy nhớ làm sạch răng bằng chỉ nha khoa mỗi ngày, đi bác sĩ nha khoa ít nhất một lần khi mang thai, và dành thời gian chăm sóc răng miệng. Trong thời gian này, nướu bị chảy máu không có gì là bất thường, nhưng cũng có thể, nó có nghĩa là bạn cần đánh răng và làm sạch răng bằng chỉ nha khoa thường xuyên hơn.Hãy bắt đầu để dành tiền cho những tháng nghỉ việc để sinh con. Việc có kế hoạch tiết kiệm chắn chắn cho khi nghỉ sinh sẽ giúp bạn giảm căng thẳng khi phải nghỉ việc một thời gian. Điều này đặc biệt quan trọng nếu có những chuyện không ngờ xảy ra, và bạn phải nghỉ việc sớm hơn dự định. "

            ),
            DataSlide(
                R.drawable.t9,
                10,
                "Điều đặc biệt cần chú ý là não bộ của bé trong tuần này phát triển rất nhanh. Các chuyên gia ước tính có khoảng 250.000 tế bào thần kinh mới được sinh ra mỗi phút. Trong tuần thai này, bé dài khoảng 4cm. Mầm răng trong miệng bắt đầu hình thành dưới nướu. Đồng thời một số xương của bé dần cứng cáp hơn.",
               "Không chơi các môn thể thao nguy hiểm, cần nhiều sức lực và tăng nguy cơ làm giảm lượng oxy cung cấp cho bé như lặn, leo núi, du lịch đến những vùng cao …; tốt hơn hết bạn nên vận động vừa phải, không được làm việc và vận động quá mức cho đến khi sinh bé. Hãy bắt đầu viết nhật ký cho con. Điều này nghe qua có vẻ ngớ ngẩn nhưng trong tương lai những dòng nhật ký mang thai này sẽ giúp bạn và bé ôn lại những ký ức ngọt ngào thời thơ ấu. Đây là thời gian thú vị dẫu rằng nó có vẻ kéo dài lâu nhưng sau này bạn sẽ ngạc nhiên là nó đã qua thật nhanh.  Thận trọng với các thực phẩm có thể gây nguy hiểm cho bạn và thai nhi. Listeria là loại nhiễm khuẩn từ thực phẩm có thể gây nguy hiểm cho thai phụ và thai nhi."
            ),
            DataSlide(
                R.drawable.t10,
                11,
                "Chiều dài của bé dài khoảng 5cm tính từ đầu đến chóp mông, trọng lượng khoảng 15g. Đầu của bé đến thời điểm này vẫn rất to so với cơ thể, chiếm 1/2 chiều dài thân mình của bé. Những ngón tay đã biết xòe ra và nắm lại, ngón chân co lại. Cơ mắt đang nhắm chặt, miệng của bé có những động tác như đang mút. Các cơ quan nội tạng như: thận bắt đầu bài tiết nước tiểu vào bàng quang, ruột được sắp xếp lại một cách trật tự trong khoang bụng. Các khớp thần kinh cũng được hình thành trong não. Đến cuối tuần này, chúng ta có thể nhìn thấy được cơ quan sinh dục ngoài của bé.",
                "Từ tuần thứ 11 của thai kỳ, do sự gia tăng lưu lượng máu qua niêm mạc mũi, các thai phụ thường dễ mắc các chứng bệnh nghẹt mũi, chảy máu cam và ù tai. Vì vậy, bạn hãy mang theo nhiều khăn giấy bên mình để dùng khi cần thiết. Cần đảm bảo cân bằng dinh dưỡng trong chế độ ăn hàng ngày. Mức tăng cân lý tưởng trong thời kỳ mang thai là từ 10-12 kg. Bạn nên chú trọng đến chất lượng hơn là số lượng thực phẩm. Kiểm soát cân nặng hợp lý và cần thận trọng trong việc lựa chọn các loại thức ăn hàng ngày."

            ),
            DataSlide(
                R.drawable.t11,
                12,
                "Từ tuần 11 đến tuần 12 thai kỳ, thai nhi có sự tăng trưởng vượt bậc. Đến tuần này, bé bắt đầu dài khoảng 5.3 cm tính từ đầu đến mông, nặng khoảng 28g. Các mẹ có thể vui mừng hơn vì bé bắt đầu hình thành nên những phản xạ. Hãy thử gõ nhẹ vào bụng, bé sẽ phản ứng ngay bằng cách vặn vẹo thân mình, ngón chân có thể cong vểnh ra. Tuy nhiên theo các chuyên gia thời điểm này vẫn còn khá sớm để các mẹ cảm nhận những cử động thai này.",
                "Khi thấy đói, bạn nên ăn ngay. Đến lúc này thì cảm giác hứng thú với chuyện ăn uống đã trở lại với bạn. Hãy đãm bảo bạn luôn có nhiều thức ăn vặt lành mạnh bên mình, và không nên nghĩ đến việc ăn kiêng. Đây không phải là thời gian để bạn giảm cân. Đừng quên chất xơ! Trái cây và rau củ là rất cần thiết vì chúng giúp tránh các vấn đề về đường ruột. Chất xơ phải cần có nước thì mới phát huy tác dụng, do vậy, bạn nên nhớ phải liên tục uống nhiều nước. Khi cảm thấy khát, nghĩa là bạn đã bị mất nước một phần. Vì vậy, nên uống nhiều ngụm nhỏ thường xuyên trong ngày. Bạn sẽ cảm thấy khỏe và dễ chịu hơn rất nhiều nếu làm được điều này. Nước cũng sẽ giúp cho trí óc bạn tỉnh táo, minh mẫn hơn.Bạn có kế hoạch cho một kỳ nghỉ? Bây giờ là thời gian để xếp hành lý và làm một chuyến nghỉ ngơi. Quý hai là gian đoạn phù hợp để đi du lịch, khi bạn đủ khỏe để thưởng thức nó và cũng ít có nguy cơ chuyển dạ sớm. Nếu định đi bằng máy bay, bạn cần kiểm tra lại với hãng hàng không về những quy định bay khi đang có thai. Bạn có thể sẽ cần một bức thư của bác sĩ để xác nhận việc mang thai. Tuần này, bạn cũng có thể muốn đi mua sắm quần áo mới. Có thể mua loại quần áo với kích thước lớn hơn, hoặc loại trang phục dành cho bà bầu, tùy bạn thôi. Phần lớn bà bầu thích kết hợp cả hai. Dù vậy, vẫn có một chút hồi hộp khi mua đồ bầu. Bạn chỉ có thể làm điều này trong một quãng thời gian nhất định nào đó của cuộc đời mình. Bạn đang mang thai, bạn đang sắp có một em bé. Có vẻ như vẫn là một điều ngạc nhiên thú vị phải không?"

            ),
            DataSlide(
                R.drawable.t12,
                13,
                "Ở tuần thứ 13, chiều dài của bé đạt 9cm, nặng khoảng 43g. Qua hình ảnh siêu âm, mẹ có thể thây “thiên thần” của mình như một quả táo. Đôi khi chúng ta có thể bắt gặp bé đang mút ngón cái, một số biểu hiện còn thể hiện qua nét mặt. Mỗi cơ quan trên cơ thể của bé đang thực hiện đúng chức năng của mình: gan bắt đầu tạo ra mật, lá lách tham gia sản xuất các tế bào máu đỏ, lông tơ phủ khắp cơ thể, thận lọc nước tiểu và thải ra nước ối xung quanh.",
                "Cố gắng tránh để bị nhiễm trùng đường tiết niệu. Đây là một tình trạng phổ biến trong thai kỳ, và mặc dù không phải là một vấn đề lớn, nó vẫn có thể gây nhiều phiền toái hơn là chỉ khó chịu chút chút. Hãy uống nhiều nước, và sau khi đi tiểu thì nên lau sạch từ từ trước ra sau. Nên làm trống bàng quang trước và sau khi quan hệ tình dục. Trường hợp bạn bị tiểu rát hay có mùi, hãy đi bác sĩ để được kiểm tra sớm."

            ),
            DataSlide(
                R.drawable.t13,
                14,
                "Tuần này, mỗi khi có ánh sáng mạnh chiếu xuyên qua thành bụng, các cơ kiểm soát mắt của bé bắt đầu làm việc. Để đảm bảo nước ối liên tục được xử lý ra và vào, các chuyển động thở và nuốt vẫn tiếp tục thực hành. Một số bé có thể phát hiện ra dây rốn và nắm lấy nó.",
                "Nếu bạn mang thai đúng vào những tháng bệnh cúm phổ biến thì hãy nghĩ đến việc chủng ngừa. Vắc-xin sẽ không có hại cho thai nhi, và có tác dụng bảo vệ phụ nữ mang thai. Bạn có thể muốn chụp để lưu lại một loạt hình ảnh mang thai của mình, để xem bụng mình phát triển ra sao trong vài tháng tới. Đây chắc chắn sẽ là một kỷ niệm đẹp. Và đừng quên chụp chung với ông xã, anh ấy là một phần trong “phi vụ” này. Quay phim cũng là một cách dễ thương để ghi lại nhật ký mang thai, nó sẽ cho những hình ảnh sinh động nhất về quá trình phát triển của bụng bầu. Nếu bạn đã có những đứa con lớn thì lúc này là thời gian để nói với chúng về em bé sắp ra đời. Chẳng bao lâu nữa các anh chị sẽ có thể nhận ra em bé đang đá hoặc di chuyển trong bụng mẹ. Nguy cơ sẩy thai ở giai đoạn này cũng thấp đi nhiều, và điều quan trọng là các anh chị của bé có cơ hội để xây dựng tình cảm gắn bó với thành viên mới sắp chào đời. Đừng quên sử dụng kem chống nắng! Bạn sẽ thấy các hắc tố (melanin) trên da mình làm cho các đốm tàn nhang và nốt ruồi trở nên sậm màu hơn. Hầu hết các loại kem chống nắng đều an toàn để sử dụng khi mang thai và sẽ không gây hại cho bạn và thai nhi. Bạn hãy tìm mua loại có thành phần bảo vệ chống cả UVA (tia gây lão hóa) và UVB (tia đốt nóng), và sử dụng theo hướng dẫn đi kèm."
            ),
            DataSlide(
                R.drawable.t14,
                15,
                "Vì làn da của bé vẫn còn mờ mờ nên qua hình ảnh siêu âm, chúng ta có thể nhìn thấy những mạch máu bên trong. Đến thời điểm này, các ông bố bà mẹ sẽ thỏa nỗi mong chờ và hồi hộp không biết con của mình là trai hay gái. Qua màn hình siêu âm, chúng ta có thể xác định rõ giới tính của bé. Nếu là bé trai, vị trí của 2 tinh hoàn nằm ở vị trí cao phía trên bụng. Nếu là bé gái, buồng trứng xuất hiện với khoảng 3 triệu trứng trong buồng trứng.",
                "Cố gắng tránh đứng lên quá nhanh nếu bạn đã ngồi trong một thời gian lâu. Huyết áp sẽ có một khoảng hụt tự động khi bạn đang nằm hoặc ngồi và đứng lên đột ngột, có thể gây ra chóng mặt hay ngất xỉu. Hãy đứng lên từ từ cho cơ thể bạn có đủ thời gian để điều chỉnh. Nếu đeo kính, hãy đi kiểm tra mắt với bác sĩ nhãn khoa, bạn có thể cần phải thay tròng mới. Nếu bạn thường sử dụng kính sát tròng thì lúc này bạn có thể cẩm thấy nó không được thoải mái như trước nữa. Những thay đổi này thường xảy ra trong khi bạn mang thai, tuy nhiên, chúng sẽ ổn sau khi bạn đã sinh em bé. Hãy giữ gìn vệ sinh cẩn thận nếu bạn dễ bị nổi mẩn, đặc biệt ở vùng háng, dưới hai bên ngực, và vùng nách- những nơi có da cọ xát với nhau và thường bị nóng nực. Bạn nên tắm và thay đồ lót thường hơn. Chất liệu cotton vẫn là thích hợp nhất vì nó thấm mồ hôi và giúp da dễ thở hơn. Vào buổi tối, bạn hãy nằm yên và cố gắng tập trung vào những gì diễn ra bên trong bụng. Bạn sẽ có thể cảm nhận được những cử động đầu tiên của em bé. Tuy nhiên, cũng đừng lo lắng nếu bạn không phát hiện ra bất cứ điều gì. Với phần lớn trường hợp con so thì Tuần 16 là thời điểm phổ biến nhất để cảm nhận được những cử động này."
            ),
            DataSlide(
                R.drawable.t15,
                16,
                "Cân nặng của “cục cưng” nhà bạn lúc này đạt khoảng 80g, chiều dài khoảng 116 mm. Thai nhi đã biết giữ cho đầu mình luôn thẳng đứng. Cơ mặt bắt đầu biểu hiện rõ nét hơn, nheo mắt hoặc cau mày lại. Canxi tiếp tục được cung cấp cho xương để phát triển.",
                "Hầu hết các bà mẹ mang thai đều nên siêu âm từ tuần thứ 16. Hãy hẹn với bác sĩ một ngày mà chồng bạn có thể đi cùng bạn. Và đừng quên lưu lại những hình ảnh đầu tiên của thai nhi để khi lớn lên, bé càng cảm nhận thêm tình yêu của mẹ và bố dành cho bé từ những ngày còn trong bụng mẹ. Thời kỳ này, bạn có thể sẽ mắc chứng đãng trí, hay quên. Vì vậy, hãy ghi chú vào giấy những thắc mắc bạn muốn hỏi bác sĩ và việc cần làm là mang theo nó khi đi khám.  Bia, rượu và các chất có cồn không tốt cho phụ nữ mang thai và cách an toàn nhất là bạn hãy kiêng tất cả những thứ độc hại này. Thay vào đó, hãy uống nhiều nước hoa quả, nước khoáng và soda, hoặc nước đun sôi để nguội với một ít chanh."
            ),
            DataSlide(
                R.drawable.t16,
                17,
                "Đến tuần thai này, bạn đừng lo sợ bé sẽ bị lạnh sau khi sinh ra nhé! Bởi lớp mỡ đang được hình thành và tích lũy để giữ ấm cho bé. Chiều dài thai nhi đo được trong tuần khoảng 12cm, nặng khoảng 100g. Nhau thai với độ dày 1cm tiếp tục nuôi dưỡng bé bằng cách cung cấp những dưỡng chất và oxy, đồng thời loại bỏ các chất thải từ bé.",
                "Nếu bạn chưa hẹn lịch siêu âm thai thì đây là thời điểm rất thích hợp. Siêu âm giữa thai kỳ có thể diễn ra từ tuần 18 đến tuần 22 để kiểm tra sự phát triển của thai nhi bao gồm sự hình thành và phát triển bộ não, tim, cột sống, gan, thận, và các cơ quan nội tạng khác. Lúc này, bạn đã có thể biết chính xác giới tính của bé qua máy siêu âm do cơ quan sinh dục ngoài đã phát triển đầy đủ. Nếu bạn muốn dành một sự ngạc nhiên cho bạn và gia đình, hãy dặn bác sĩ siêu âm không tiết lộ giới tính thai nhi cho đến ngày bạn sinh bé. Hãy thường xuyên trò chuyện với bé từ lúc còn trong bụng mẹ. Từ tuần thứ 17, bé đã có thể nghe và phân biệt được giọng nói của bạn. Hãy rủ ông xã cùng tận hưởng cảm giác sung sướng khi nhận thấy những chuyển động của bé. Tập thể dục cho bà bầu và vận động vừa phải để đảm bảo cân nặng hợp lý trong thời kỳ mang thai, đồng thời cũng giúp bạn giảm nguy cơ bị tiểu đường thai kỳ. Bạn nên tham gia các lớp thai giáo, luyện tập các bài tập hữu ích, trò chuyện và chia sẻ kinh nghiệm mang thai với các bà bầu khác."
            ),
            DataSlide(
                R.drawable.t17,
                18,
                "Bé đã bắt đầu tiến hành gập chân và tay rồi các mẹ nhé! Từ bây giờ đến sắp tới, mẹ bầu sẽ cảm nhận những chuyển động này rõ hơn. Tay chân của bé cân đối hơn, tóc trên da đầu bắt đầu mọc, thận tiếp tục lọc nước tiểu. Điều đáng vui mừng là bé có thể nghe được giọng nói của mẹ. Vì vậy các mẹ hãy nói chuyện hoặc thường xuyên tâm sự, kể chuyện bé nghe!",
                "Nếu bạn lo lắng vì mắc phải bệnh giãn tĩnh mạch, hãy thường xuyên mang vớ cho bà bầu để hỗ trợ đôi chân và nâng đỡ phần bụng dưới. Tranh thủ nghĩ ngơi, thả lỏng chân tay khi có thể và tránh đứng quá lâu.  Đảm bảo chế độ ăn nhiều chất xơ và uống nhiều nước sẽ giúp bạn xoá tan nỗi lo bệnh trĩ. Chất xơ có nhiều trong các loại đậu, ngũ cốc, rau và trái cây. Ngoài ra, bạn không nên cố nhịn khi có nhu cầu đi vệ sinh nếu không về lâu về dài sẽ gây ra những chứng bệnh không đáng có.  Tham gia ngay các lớp học tiền sản nhằm giúp bạn có sự chuẩn bị tốt nhất để đón bé chào đời. Nếu đây là lần sinh con thứ hai, bạn vẫn nên tham gia khoá học này nhằm bổ sung những kiến thức cập nhật nhất cho quá trình mang thai và sinh con. Bạn cũng nên đọc sách và vào xem những trang web đáng tin cậy để tìm hiểu thêm thông tin hữu ích về những thay đổi trong thai kỳ, quá trình chuyển dạ và cách chăm sóc bé sau sinh.  Đau lưng là một bệnh rất phổ biến trong thai kỳ. Vì vậy, bạn hãy học cách bảo vệ lưng và luyện tập hợp lý để giảm đau lưng. Những sinh hoạt hằng ngày như xách nước, bế trẻ và dịch chuyển đồ đạc nặng nề...đều nên tránh trong giai đoạn này. Nếu bị đau lưng, bạn hãy tắm bằng nước ấm, chườm nóng và luyện tập các động tác thể dục nhẹ nhàng. Những bài tập này sẽ giúp bạn giảm đau hiệu quả. Nếu cơn đau lưng kéo dài, bạn nên đi khám bác sĩ để được làm vật lý trị liệu. "

            ),
            DataSlide(
                R.drawable.t18,
                19,
                "Hình dáng thai nhi lúc này như một trái xoài, dài khoảng 16.5 – 25.5 cm, nặng chừng 300g. Bé nuốt nhiều nước ối hơn để thu nhận chất dinh dưỡng, tốt cho hệ tiêu hóa. Đặc biệt, thời điểm này bé thải phân su màu đen tích tụ trong ruột của bé hoặc trong bụng mẹ.",
                "Hãy đi chơi thư giãn. Đây chính là thời điểm có thể nghĩ đến chuyện tạm nghỉ ngơi trước khi sinh, và vì cơ thể chưa nặng nề nên bạn vẫn có thể đi du lịch"
            ),
            DataSlide(
                R.drawable.t19,
                20,
                "Những phản xạ tiếp tục hình thành và phát triển: bé nắm chặt dây rốn, ngậm ngón tay cái và kể cả nấc cục. Làn da đã có lớp mỡ xuất hiện ở lớp dưới nên không còn trong suốt như thời gian trước nữa. Có chút thay đổi về bộ phận sinh dục: Nếu là bé trai, tinh hoàn di chuyển từ bụng xuống bìu. Đối với bé gái, tử cung và âm đạo được định vị đúng và tiếp tục phát triển.",
                "Hãy đi chơi thư giãn. Đây chính là thời điểm có thể nghĩ đến chuyện tạm nghỉ ngơi trước khi sinh, và vì cơ thể chưa nặng nề nên bạn vẫn có thể đi du lịch. Hầu hết các hãng hàng không đều có những quy định hạn chế bay đối với phụ nữ mang thai từ 36 tuần trở đi, và nếu bắt buộc phải bay thì phải có giấy đảm bảo của bác sĩ. Nếu bạn mang đa thai hoặc từng có biến chứng, có thể từ tuần thai 32 trở đi bạn đã cần hạn chế bay. Tránh làm đau lưng khi mang thai. Nếu bạn đã có con đầu đang tuổi tập đi, bạn chỉ cần cúi xuống với trẻ chứ đừng bế trẻ thường xuyên. Khuyến khích trẻ leo vào lòng khi bạn đang ngồi hoặc đang nằm. Phụ nữ mang thai thường hay bị đau lưng, do vậy bạn cần chú ý chăm sóc cho lưng mình. Ví dụ, nếu nếu nệm giường của bạn đã bị lõm, không tạo cảm giác thoải mái và không giúp giữ thẳng cột sống của bạn thì hãy mạnh dạn thay nệm mới tốt hơn nhé. Hãy nhớ rằng, bạn sử dụng nệm ít nhất 8 tiếng mỗi ngày cơ đấy! Nếu bạn không phải hạn chế tiếp xúc với nước thì hãy tận hưởng thời gian tắm bồn nhé. Trong vài tuần tới, có thể bạn sẽ thích nằm ngửa trong bồn và nhìn những chuyển động nho nhỏ nhô lên trên bề mặt bụng. Bạn cảm thấy bé yêu đang xoay người, đụng mạnh hay ngón tay bé đang nhíu vào thành tử cung, hoặc bàng quang của bạn tự nhiên có cảm giác như có chút dòng điện rất nhẹ chạm vào, v.v…, tất cả đều cho thấy em bé của bạn đang hoạt động tích cực. Nhớ chú ý chăm sóc cho cơ sàn khung xương chậu của bạn bằng cách thực hiện các bài tập làm chắc cơ, nhưng tránh các bài va chạm, lặp đi lặp lại. Tốt hơn là bạn đi bộ, bơi, tập thư giãn cơ, tập yoga cho bà bầu hoặc thể dục nhẹ nhàng."

               )
                ,
            DataSlide(
                R.drawable.t20,
                21,
"Kích thước của bé lúc này đạt khoảng 28cm, nặng 450g, hình dáng gần như trẻ sơ sinh. Tuyến tụy trong bụng bé đang phát triển đều đặn để tạo một số nội tiết tố quan trọng. Lông tơ tiếp tục phủ kín cơ thể, những chi tiết trên gương mặt (mí mắt, lông mày, môi) dần rõ nét hơn.",
"Cho dù rất mệt, bạn vẫn hãy nhớ tập duỗi thẳng người trước khi đi ngủ. Ngoài ra, đừng để đồ vật gì gần giường ngủ để tránh bị vấp ngã lỡ như bạn cần vội thức dậy lúc nửa đêm. Đừng bỏ qua kiểm tra tiền sản định kỳ hàng tháng, và nhớ đánh dấu trên lịch. Các bệnh viện và phòng khám thường xếp lịch khám cho nhiều người cùng một lúc, vì thế bạn cần dự trù một khoảng thời gian kha khá cho cuộc khám định kỳ. Đừng chỉ băn khoăn đến những công việc bạn sẽ làm sau khi kiểm tra định kỳ xong. Bạn hãy tìm mua một số sách dạy nấu ăn và nghĩ về các món ăn thích hợp có thể để sẵn trong tủ lạnh, như thế bạn sẽ biết được những món nào hấp dẫn với mình và vẫn ngon sau khi rã đông. Có rất nhiều loại thức ăn ngon như vậy."
            ),
            DataSlide(
                R.drawable.t21,
                22,
"Đây là tuần thai ưu tiên cho sự phát triển của các giác quan của bé. Lưỡi hình thành trên bề mặt những gai vị giác. Não tiếp tục hoàn thiện để cảm nhận những va chạm tiếp xúc. Cảm xúc thông qua nét mặt biểu hiển rõ hơn: bé nheo mắt, cau mày hoặc mút ngón tay cái.",
"Hãy hỏi ý kiến người hộ sinh hoặc bác sĩ của bạn xem bạn có nên làm kiểm tra sàng lọc glucose để phát hiện bệnh tiểu đường thai kỳ. Việc này thường được tiến hành từ tuần 24-28 của thai kỳ. Bạn sẽ cần phải uống một loại chất dịch rất ngọt, có vị như nước cam và sẽ được lấy máu 1h sau đó. Nếu cơ thể bạn có khả năng sản xuất đủ insulin để xử lý lượng đường tăng vọt, thì mọi việc đều ổn. Nếu không, cần phải có mức sàng cao sâu hơn. Nếu bạn thường nhuộm tóc, hãy nghĩ đến việc để tóc mình tự nhiên khi đang mang thai. Mặc dù không có bằng chứng khoa học vững chắc nào liên hệ việc nhuộm tóc với rủi ro trong thai kỳ, chọn cách an toàn vẫn hơn. Tương tự, hoãn việc uốn tóc hoặc dùng hóa chất trị liệu trên da đầu, ít nhất là cho đến khi đứa trẻ ra đời. Giữ một ít nước ép nam việt quất trong tủ lạnh. Nguồn vitamin C dồi dào này còn có tác dụng phòng ngừa nhiễm trùng đường tiết niệu. Vì nó có tính axit cao, nó giúp chống lại vi khuẩn gây ra nhiễm trùng đường tiết niệu và nó còn có vị rất ngon. Đặt một chiếc ghế gác chân bên dưới bàn làm việc và phía trước chiếc ghế bành yêu thích của bạn. Thả lỏng chân và bàn chân sẽ không giúp gì cho chứng sưng mắt cá chân. Tập thói quen nâng chân khi có thể để tránh tụ máu và sung huyết."
            ),
            DataSlide(
                R.drawable.t22,
                23,
"Thai nhi nặng khoảng 450g, trường hợp chuyển dạ và sinh non bé thường có cân nặng chưa đến 450g. Khi ra môi trường bên ngoài nếu có sự chăm sóc y tế đặc biệt, bé vẫn có thể sống sót nhưng sẽ mắc một số khiếm khuyết. Qua hình ảnh siêu âm có thể các mẹ sẽ thắc mắc vì sao đến thời điểm này da của bé vẫn còn trông rất nhăn nheo. Bởi da được sản sinh nhanh hơn lượng mỡ đệm dưới da.",
"Thắt dây an toàn khi ngồi trong xe. Mặc dù có thể bạn cảm thấy hơi chật, lựa chọn an toàn nhất của bạn vẫn là thắt dây an toàn mọi lúc. Một số phụ nữ mang thai bị say tàu xe khi dùng phương tiện công cộng do thiếu không khí trong lành. Hãy ngồi ở dãy ghế hai bên xe tàu xe nếu bạn cần, và tập trung nhìn về phía đường chân trời. Nhấp một ít nước lạnh có thể có ích, hoặc bạn có thể dùng vòng bấm huyệt hoặc ăn một ít thức ăn có vị gừng. Nếu ai đó xung quanh bạn đang hút thuốc, hãy tránh đi. Hút thuốc thụ động cũng độc gần như hút thuốc chủ động, và nhau của bạn sẽ không lọc tất cả khí CO và các hóa chất khác mà bạn hít vào một cách thụ động. Nếu bạn vẫn đang hút thuốc, phải tìm mọi cách để bỏ. Hãy xem xét liệu pháp thôi miên, châm cứu hoặc tìm một nhóm hỗ trợ. Tất cả những phương pháp này đều đã được kiểm chứng giúp bạn tăng khả năng bỏ hút thuốc thành công. Tập thói quen nằm về phía bên trái, thay vì nằm ngửa. Tử cung trĩu nặng của bạn có thể chèn ép các mạch máu quan trọng cung cấp oxi cho nhau và em bé. Bạn cũng có thể thấy choáng hoặc ngất nếu nằm thẳng trong một thời gian. Nhớ đầu tư gối chất lượng tốt và sắp xếp sao cho thoải mái nhất trên giường. Đừng quên dành chút không gian cho bạn đời của mình. Hãy đảm bảo bạn hiểu rõ những loại thức ăn bạn phải tránh. Vi khuẩn hình que hiếm gặp nhưng rất nguy hiểm, có thể tìm thấy trong một số món ăn. Phó-mát mềm, xà lách trộn, pate, sữa chưa tiệt trùng, thịt đông lạnh, sushi và thịt sống đều có thể có nguy cơ. Giữ vệ sinh cho nhà bếp và rửa tay sạch sau khi xử lý thịt sống.Nếu bạn thấy đau, bị ra máu hoặc có bất kỳ triệu chứng bất thường nào, bạn cần phải báo với hộ sinh hoặc bác sĩ của bạn. Một số phụ nữ dễ bị sinh non hơn, nhưng dấu hiệu bắt đầu có thể khá mơ hồ. Đừng ngại kiểm tra ngay cả khi bạn chỉ muốn biết để an tâm hơn."
            ),
            DataSlide(
                R.drawable.t23,
                24,
"Trong ngày, hầu hết thời gian của bé dành cho việc co người lại, gấp cả chân ép vào mông. Thỉnh thoảng bé có thể duỗi chân tay nhưng rất ít. Tuần thai thứ 24, bé bắt đầu học cách thực hành những chuyển động mắt: nhắm mắt, chớp mắt và luyện tập tập trung điểm nhìn. Cơ thể mẹ sẽ cảm giác rất rõ những cú đạp hay những lần duỗi người trong bụng. Từ đầu đến gót chân, bé dài khoảng 34cm trong tuần thai 24",
"Hãy tham khảo ý kiến bác sĩ hay hộ sinh của bạn xem bạn có cần được kiểm tra nồng độ huyết sắc tố (Haemoglobin) vào lần khám thai tới hay không. Thiếu sắt là chứng thường gặp ở thai phụ khi nhu cầu về lượng hồng cầu đạt đỉnh điểm. Bạn nhớ ăn các thức ăn giàu chất sắt như các loại thịt đỏ, các loại trứng, các loại ngũ cốc chất lượng tốt, và rau xanh có lá như bông cải xanh. Nếu hàm lượng sắt trong máu bạn quá thấp, bạn có thể uống thêm viên sắt. Tuy nhiên, viên sắt có thể khiến chứng táo bón của bạn càng nặng hơn."
            ),
            DataSlide(
                R.drawable.t24,
                25,
"Chiều dài bé đạt 35cm từ đầu đến gót chân và nặng khoảng 750g. Tuần này, mạng lưới các dây thần kinh trong tai của bé nhạy cảm hơn. Hãy luyện tập kỹ năng nghe của thai nhi bằng cách kể chuyện, nghe nhạc, nói chuyện, tâm sự.",
"Hãy nghĩ xem bạn muốn xây dựng chế độ dinh dưỡng cho em bé như thế nào. Một trong những yếu tố quan trọng của một chế độ cho con bú tốt chính là tinh thần của người mẹ trong suốt quá trình mang thai. Những tác động khác gồm có: bạn đời biết quan tâm hỗ trợ, thái độ tích cực của bà ngoại và/hoặc bà nội em bé; và những phản ứng từ những người khác trong gia đình, trong cộng đồng. Hãy đi xem trước bệnh viện hay nhà hộ sinh nơi bạn dự định sinh em bé. Nếu bạn chưa đặt phòng, hãy tìm hiểu các lựa chọn khác nhau. Một số bệnh viện tư yêu cầu đặt cọc trước khi họ tiến hành thủ tục. Bạn hãy tìm hiểu về ghế ngồi ô tô dành cho em bé để biết loại nào sẽ vừa vặn nhất với xe của bạn, và an toàn nhất cho bé. Nếu bạn dự định thuê những thứ này, bạn nên đặt từ bây giờ. "
           ),
            DataSlide(
                R.drawable.t25,
                26,
"Đến tuần thai thứ 26, “cửa sổ tâm hồn” của bé đã mở ra. Qua siêu âm, bạn có thể thấy rõ màu mắt và những sợi lông mi nhỏ trên đôi mắt của bé. Về cân nặng, bé vẫn tiếp tục tăng đều, nặng khoảng 820g.",
"Nếu bạn cảm thấy mình cần đi toilet mỗi 5 phút, hãy ngồi yên. Có thể là em bé đang nằm ở một vị trí rất đặc biệt ngay trên bọng đái của bạn. Hãy nằm nghiêng qua một bên để xem thử có thể thay đổi được tư thể nằm của em bé không. Cẩn thận với các cảm giác khó tiêu và ợ chua. Mọi thứ sẽ trở nên sáng sủa hơn rất nhiều khi cơ thể của bạn ngừng sản xuất và tồn đọng relaxin và progesterone. Nói về relaxin, nồng độ của nội tiết tố quan trọng này khi bạn mang thai sẽ tăng gấp 10 lần so với khi bạn bình thường. Xoa dịu cảm giác đau lưng khi mang thai bằng những bài tập thể dục. Hỏi ý kiến của một bác sĩ sản khoa về việc làm thế nào mà bạn có thể tăng cường sức khỏe cho các cơ và khớp của bạn để chống chịu với những cơn đau. Đi nghỉ. Đây chính là lúc thích hợp nhất để sắp xếp thời gian nghỉ dưỡng trước khi bạn sinh con. Có một kỳ nghỉ khá hợp lý từ lúc bạn nghỉ làm cho tới ngày sinh có thể sẽ làm sức khỏe của bạn hồi phục khá hiệu quả. Đây cũng là thời gian để bạn tịnh tâm và suy nghĩ đến những việc quan trọng sắp tới trong cuộc sống. Nếu bạn đã con con rồi, lúc này bạn sẽ có cơ hội để chia sẻ, hỏi han trực tiếp con cái của bạn về cảm giác của chúng trước khi chúng sẵn sàng đón nhận một người em ruột sắp chào đời."

            ),
            DataSlide(
                R.drawable.t26,
                27,
"Thị lực của thai nhi ngày càng phát triển, thông qua thành tử cung bé có thể nhìn thấy ánh sáng mờ mờ. Trong bộ não, hàng tỷ tế bào thần kinh vẫn tiếp tục hình thành và tăng trưởng. Tuần thai thứ 27, bé dài khoảng 37cm từ đỉnh đầu đến gót chân, nặng khoảng 1kg.",
"Hỏi bác sĩ của bạn về việc kiểm tra lượng sắt trong cơ thể. Bạn sẽ cần thử máu để xác định lượng sắt trong cơ thể và xem liệu có cần phải bổ sung thêm sắt hay không. Bạn cũng cần các xét nghiệm nhóm máu và yếu tố Rh trong máu. Nếu Rh âm (Rh-) bạn phải chắc chắn rằng cơ thể bạn không sản xuất ra bất kì kháng nguyên nào. Nếu bạn không thể quyết định được tên cho bé, hãy lập danh sách những cái tên mà bạn mong muốn. Nhiều cặp cha mẹ trì hoãn việc đặt tên cho đến khi họ được nhìn thấy khuôn mặt của em bé. Trong khoảnh khắc rạng ngời ấy họ biết được em bé cần phải có tên gì. Đôi khi những cái tên lại không nằm trong danh sách. Nếu bạn có dấu hiệu của bệnh trĩ, hãy tránh các bài tập thể dục mà bạn phải đứng chịu toàn bộ sức nặng của cơ thể bởi vì nó có thể làm gia tăng áp lực lên ổ bụng và trực tràng. Thay vào đó hãy hướng đến các bài tập nhẹ nhàng như yoga cho bà bầu hay bơi."
            ),
            DataSlide(
                R.drawable.t27,
                28,
"Đến tuần lễ này, da của bé trông đỡ nhăn nheo hơn trước bởi lớp mỡ đang tích cực tích tụ dưới da. Hệ thần kinh và não bộ của thai nhi dần được hoàn chỉnh. Các chuyên gia cho rằng sự liên kết tình cảm giữa người mẹ và đứa con trong bụng rất quan trọng. Bé cảm nhận được tình yêu thương của bạn dành cho bé thông qua các hoạt động như nói chuyện, xoa bụng, ca hát…",
"Hãy lập danh sách các câu hỏi bạn thắc mắc khi đi khám thai vì có thể bạn sẽ quên những điều quan trọng khi gặp bác sĩ. Bạn cũng nên tránh tối đa những cảm giác sợ hãi, buồn rầu hay tiêu cực."

            ),DataSlide(
                R.drawable.t28,
                29,
"Một bó súp lơ lớn chính là hình tượng bây giờ của bé đang trong bụng của mẹ bầu. Bao quanh một thai nhi nặng khoảng 1.4kg là 0.8 lít nước ối. Bé ngày càng lớn lên, chiếm nhiều diện tích hơn trong tử cung đồng nghĩa với việc khối nước ối sẽ giảm đi. Thị lực của bé lúc này chỉ đạt 1/20 thị lực khi sinh ra, tức chỉ nhìn thấy những thứ ở khoảng cách 10cm trở lại.",
"Từ giờ trở đi, bạn cần khám thai thường xuyên hơn. Rất có thể bạn cần gặp bác sĩ hàng tháng để đánh giá sự phát triển của bé và kiểm tra tình trạng của mình. Những lần khám này có thể rất thú vị ngay cả khi bạn thấy dường như có nhiều thông tin lặp đi lặp lại. Tuy vậy, các thông tin này là vô cùng quan trọng, và hãy nhớ là kể từ tuần này bạn không nên giãn thời gian giữa các lần khám. Ăn nhiều cá tươi. Axit béo Omega-3 sẽ tác động trực tiếp vào mắt và não bộ của bé, nên những loại cá nhiều dầu như cá mòi, cá hồi và thậm chí cả tôm là những nguồn thực phẩm rất tốt. Hằng ngày bạn cũng nên ăn một chút các loại hạt, bơ động vật, bơ thực vật cả một chút váng sữa. Nếu bạn làm công việc văn phòng hoặc phải ngồi một chỗ trong nhiều giờ liền, hãy cố gắng đứng dậy, đi lại một chút sau mỗi tiếng đồng hồ. Đi bộ sẽ giúp lưu thông máu ở hai chân, vì vậy bạn nên đi bộ tập thể dục hằng ngày, thậm chí đi quãng dài và hơi dốc để tập cho nhịp tim của bạn tăng lên một chút.Bạn cần chú ý đến các cử động đạp của bé. Bạn không cần phải ghi chép lại trừ phi bác sĩ yêu cầu. Nhưng nhìn chung, nếu bạn biết rõ về các cử động đạp của bé yêu thì sẽ dễ cảnh giác hơn nếu bỗng nhiên bé yêu ít đạp hẳn đi."
            ),
            DataSlide(
                R.drawable.t29,
                30,
"Bé bắt đầu cử động liên tục cơ hoành để diễn tập các động tác thở một cách nhịp nhàng, chuẩn bị cho việc hô hấp sau này. Tình trạng nấc cục có thể xảy ra khi bé vô tình hít phải nước ối. Lúc này bé nặng 1.4kg và dài khoảng 27cm. Trong tuần thai 30, bé có thể ngọ nguậy, đạp và lộn nhào nhiều hơn ",
"Chú ý tránh các hoạt động đột ngột dễ làm đau lưng khi mang thai.  Khi bạn ra khỏi giường, đầu tiên hãy nằm nghiêng một bên, rồi dùng hai tay chống cơ thể lên để bạn ngồi được thoải mái. Xê mông đến gần thành giường để không phải vươn người về phía trước quá mức. Bạn hãy tập thói quen ngồi một, hai phút trên giường như thế trước khi đứng dậy. Huyết áp của bạn giảm xuống khi nằm so với khi đứng, vì vậy hãy cho cơ thể bạn một vài phút để thích ứng.\n" +
        "Hãy đầu tư mua một số quần lót co giãn tốt cho phụ nữ mang thai. Mặc dù không đẹp, nhưng chúng là những người bạn đồng hành thân thiết của bạn. Loại quần này được thiết kế để phù hợp với bụng bầu ngày càng to, để ôm sát và vừa vặn với bạn cả khi ngồi cũng như lúc đứng, chúng sẽ giúp bạn loại bỏ cảm giác khó chịu vì cấn bụng.\n" +
        "Tránh ăn nhiều, ăn không điều độ. Bạn nên ăn các thức ăn nhẹ, dễ tiêu hóa như trái cây, rau, bánh mì kẹp nướng, rau sống trộn, sữa chua, ngũ gốc, bánh quy giòn và pho mát. Nhớ uống nhiều nước. Cung cấp đủ nước cho cơ thể sẽ giúp tinh thần tỉnh táo và thận hoạt động tốt.\n" +
        "Nếu bạn chưa có máy ảnh tốt thì hãy tìm hiểu đôi chút để mua. Có thể bạn sẽ mong muốn ghi lại những khoảng khắc khi bé chào đời.\n" +
        "Hãy hỏi bác sĩ về những lợi ích của việc tập giãn các cơ tầng sinh môn. Nếu bạn định sinh thường, tầng sinh môn của bạn cần phải giãn rất nhiều để giúp đầu của bé lọt ra. Đôi khi cần phẫu thuật mở âm đạo để cửa âm đạo rộng ra hơn, dù vậy, tập co giãn tầng sinh môn thì có thể không cần phẫu thuật mở âm đạo.\n"
            ),
            DataSlide(
                R.drawable.t30,
                31,
"Giả sử bé ra đời vào tuần thứ 31, bé vẫn có thể sống được do phổi của bé đến thời điểm này đã hoàn thiện. Tuy nhiên bé vẫn cần phải có thiết bị hỗ trợ thở khi tồn tại ở môi trường bên ngoài. Hiện bào thai có chừng 1 lít nước ối và đạt khối lượng lớn nhất từ trước đến nay. Nếu thận của bé sản xuất khoảng 500ml nước tiểu hàng ngày, thận được xem là hoạt động bình thường.",
"Hãy tiết kiệm một số tiền mỗi tuần để giúp cân bằng ngân sách gia đình sau khi bạn sinh em bé. Trở nên phụ thuộc về tài chính sẽ là một thay đổi lớn đối với nhiều phụ nữ, nhất là những người luôn tự hào về sự đóng góp của mình vào thu nhập của gia đình.\n" +
        "Bạn thường chỉ tập trung mua sắm cho em bé mà nhiều khi quên mất chính mình. Nên chăm sóc bản thân mình, và thi thoảng có thể có một chút “quỹ đen” cũng không sao. Những chỗ tiền giấu riêng ấy lại thường là điều khiến nhiều bà mẹ vui nhất mỗi khi ngân sách gia đình bị hạn hẹp.\n" +
        "Nên nắm rõ chu trình hoạt động và nghỉ ngơi của em bé trong bụng bạn. Nếu có gì thay đổi, hơn ai hết, bạn phải là người biết rõ cái gì là bình thường, cái gì không dựa vào những cử động của con bạn. Bây giờ dạ con của bạn đang khá là chật chội, nên sẽ không còn những cú trở nhào hay lật người vốn rất thường xuyên trước đây. Bù lại, bạn sẽ được “tận hưởng” hàng ngày những cú đá từ hai bàn chân khỏe khoắn, những cú chỏ vào mạn sườn, hay những cú đạp vào bàng quang của bạn. Hãy dành thời gian thư giãn với những chuyển động của em bé. Cho dù điều này là khó hình dung với bạn ngay lúc này, nhưng sự thực là nhiều bà mẹ nói rằng, sau khi con đã ra đời, họ thấy nhớ cái cảm giác có em bé cứ cử động bên trong bụng mình.\n"

            ),
            DataSlide(
                R.drawable.t31,
                32,
"Khung xương cứng cáp hơn, da không còn nhăn nheo nữa – đó là những thay đổi của thai nhi trong tuần này. Bé cưng của bạn nặng khoảng 1.8kg, dài hơn 43 cm, hình dáng như một trái bí đao. Xương trên hộp sọ của bé vẫn chưa khít hẳn cho đến khi sinh ra và lớn lên.",
"Hãy tận dụng cuối tuần để đi chơi xa. Một “tuần trăng mật bầu bì” sẽ là một cơ hội tuyệt vời để hai bạn tận hưởng thời gian bên nhau, và cùng nhau tập trung vào những gì quan trọng nhất trong cuộc sống của mình. Nhớ mang theo máy ảnh và ghi lại những khoảnh khắc quý báu khi bạn đang mang thai này. Có thể bạn thấy mình không lấy gì làm quyến rũ cho lắm, nhưng sẽ có lúc bạn nhìn lại số ảnh này vì thầm mừng rằng may mà mình đã lưu lại những giây phút ấy.\n" +
        "Hãy đi đứng khoan thai, đừng vội vàng gì cả. Do độ cân bằng cơ thể đang thay đổi nên phụ nữ mang thai thường dễ bị ngã hơn. Bạn cũng sẽ không nhìn thấy rõ mặt đất dưới chân mình nữa do tầm nhìn bị chắn bởi chiếc bụng quá khổ, vậy nên hãy cứ ung dung, từ tốn.\n" +
        "Hãy lên kế hoạch để hoàn thành các công việc của mình nếu bạn chưa hoàn thành chúng. Hãy tính toán một cách thực tế về lượng công việc bạn có thể hoàn tất, và biết công việc nào có thể giao lại cho người khác. Bạn cần phải tạm nghỉ việc với tinh thần thoải mái rằng bạn đã xong xuôi công việc của mình, và giờ là lúc bạn tập trung cho một giai đoạn rất quan trọng trong đời.\n"

            ),
            DataSlide(
                R.drawable.t32,
                33,
"Cân nặng của bé đạt 2.15g với chiều dài gần 46cm. Khi siêu âm bạn sẽ thấy bé trở nên tròn trĩnh hơn bởi lớp mỡ dưới da dày hơn, da của bé căng mịn hơn. Hệ thần kinh và hô hấp của bé đang trưởng thành và hoàn thiện dần. Do đó từ tuần này trở đi nếu chẳng may có sinh sớm mẹ cũng đừng quá lo lắng vì bé vẫn có thể khỏe mạnh ở môi trường bên ngoài.",
"\n" +
        "\"Nếu bạn định nuôi con bằng sữa mẹ, hãy tham gia một lớp hướng dẫn cho con bú. Đọc sách báo về việc làm sao để áp em bé vào ngực đúng cách khi cho bú sẽ rất khác với lúc quan sát trực tiếp. Đa phần các bà mẹ cho con bú đều gặp khó khăn trong thời gian đầu khi mới bắt đầu tập bú cho bé.\n" +
        "Hãy mua một số tấm trải ni-lông để đặt lên chiếu của bạn. Nếu bạn bị vỡ ối khi đang nằm trên giường, bạn sẽ thấy nhẹ cả người vì mình đã chuẩn bị trước. Cũng nên chuẩn bị một cái khăn bông trong xe của bạn nữa, phòng khi bạn cần đến nó. Nếu nước ối bị vỡ khi đầu của em bé vẫn còn nằm cao phía mạng sườn, thì có khả năng nước ối sẽ phun ra nhiều hơn so với khi em bé đã trôi xuống phía dưới, nằm ở phần xương chậu.\n" +
        "Nếu bạn vẫn chưa đăng ký gói dịch vụ sinh nở nào, thì bây giờ hãy chuẩn bị cho việc đó. Suy nghĩ xem bạn muốn sinh cách nào, và ai là người ở bên cạnh bạn khi bạn sinh. Hãy nhớ rằng, khi nói đến chuyện sinh con thì không có gì là chắc chắn, và ưu tiên lớn nhất của bạn vẫn phải là sức khỏe và hạnh phúc của bạn và em bé.\n" +
        "Hãy nhìn vào danh sách tên mà bạn muốn đặt cho em bé, và chọn lấy những cái nào nổi bật nhất, khiến bạn thích nhất. Có thể có những cái tên vừa tháng trước bạn còn rất thích thú, thì giờ đây đã bị đẩy sang cột “chắc chắn không chọn”. Nếu bạn và bạn đời không thể đồng ý về một cái tên, thì hãy để cho cả hai có thêm thời gian. Đừng đánh giá thấp khả năng của em bé, vốn có thể khiến cho bạn nghĩ tới một cái tên mà bạn chưa từng nghĩ ra. “Trông con mình giống như một…” là câu nói mà các ông bố bà mẹ khắp nơi trên thế giới thường thốt lên.\n" +
        "\""
           ),
            DataSlide(
                R.drawable.t33,
                34,
"Cân nặng của bé tuần thai này đạt 2.25kg, dài khoảng 32cm. Xương của bé đang phát triển tốt, tuy nhiên mẹ bầu cần bổ sung nhiều thực phẩm chứa hàm lượng canxi dồi dào kẻo tránh tình trạng thiếu canxi. Bởi trong suốt quá trình mang thai, bé sẽ lấy hết canxi từ cơ thể mẹ để hỗ trợ sự phát triển xương.",
"\"Đừng quên đánh răng đấy! Viêm lợi có thể gây ra sinh non, thế nên việc đánh răng ít nhất hai lần một ngày, xỉa răng bằng chỉ nha khoa, và khám răng thường xuyên là rất quan trọng. Nếu suốt thai kỳ bạn vẫn chưa đi nha sỹ lần nào, thì hãy đặt hẹn ngay. Vi khuẩn gây sâu răng lây rất nhanh, và người mẹ sẽ dễ dàng truyền vi khuẩn đường miệng sang con thông qua nước bọt và hơi thở khi miệng em bé đang bị khô.\n" +
        "Bạn cần phải nghỉ trưa, nhưng chớ nên ngủ nhiều hơn một tiếng. Ngủ trưa quá nhiều có thể gây ra chứng mất ngủ về đêm, vậy nên hãy cẩn thận với lượng thời gian bạn ngủ trưa cho dù bạn có mệt đến đâu.\n" +
        "Hãy tham khảo trang www.sidsandkids.org để có những thông tin hay, chuẩn xác, có cơ sở về việc chuẩn bị cũi em bé. Hãy làm theo hướng dẫn của họ về việc cho em bé ngủ một cách an toàn, và làm tất cả mọi thứ để giảm thiểu nguy cơ của chứng SUDI (Đột tử không thể giải thích ở trẻ nhỏ). Chuẩn bị sẵn đầy đủ thông tin luôn luôn rất quan trọng.\n" +
        "\""
            ),
            DataSlide(
                R.drawable.t34,
                35,
                "Từ thời điểm này cho đến khi chào đời, bé tăng cân rất nhanh, khoảng 0.5kg/tuần. Nếu là con đầu lòng, bé sẽ quay đầu trong tuần thai 35. Nếu là con thứ thì thời điểm xoay ngôi có thể sang tuần 36 hoặc 37. Tử cung bắt đầu chật chội, bé không còn đủ không gian để cử động nữa. Tuy nhiên mỗi lần cử động với cường độ rất mạnh, khiến mẹ bầu cảm thấy đau. Những trường hợp như vậy, hãy xoa bụng và vỗ về nhẹ nhàng, nói chuyện để bé hiểu. Bé bắt đầu xoay đầu từ tuần tuổi 35 để chuẩn bị chào đời",
                "\"Hãy chụp ảnh lưu lại kỷ niệm của những tuần cuối thai kỳ này để sắp xếp tất cả theo trình tự thời gian. Bạn rồi sẽ nhìn lại những bức ảnh này, và tự hỏi da mình còn có thể kéo căng đến mức nào. Hãy đo vòng bụng bằng một cái thước dây và đo đường kính đi ngang qua rốn của bạn. Hãy xem xem vòng bụng đã lớn nhanh như thế nào chỉ trong vòng vài tuần. Hãy ghi chép đánh dấu trong lịch của bạn và theo dõi sự tăng trưởng của bụng bầu.\n" +
                "Hãy siêng năng đọc tài liệu về việc sinh con để có một cuộc sinh nở chủ động và suôn sẻ. Những bậc cha mẹ đã có chuẩn bị về kiến thức sinh con thường sẽ thấy mình trở thành một phần trong cuộc sinh nở đó, chứ không giống như người ngoài cuộc, chỉ biết đứng nhìn. Nếu bạn dự định sinh ở nhà, hãy nói cho hộ sinh biết bạn đang cần những gì. Hãy lập một danh sách những số điện thoại cần gọi khi khẩn cấp, và đặt ngay cạnh điện thoại của mình là tiện nhất.\n" +
                 "Hãy gói ghém sẵn túi đồ đạc gồm những vật dụng thiết yếu để bạn đi sinh ở bệnh viện. Hãy nhớ các thứ sau: những vật dụng để tắm rửa và vệ sinh cá nhân, áo quần cho bạn và cho em bé, tã cho bé sơ sinh, thuốc men, thẻ bảo hiểm, chi tiết về gói bảo hiểm y tế, danh sách các số điện thoại của gia đình, bạn bè thân thiết; và quan trọng hơn cả: chiếc gối của bạn. Hãy nhớ là bạn không cần soạn đồ như thể bạn đang chuẩn bị leo lên tàu viễn dương thám hiểm biển Ca-ri-bê. Và nếu bạn có quên thứ gì thì bố em bé vẫn có thể mang vào bệnh viện cho bạn cơ mà.\n" +
                "\""
            ),
            DataSlide(
                R.drawable.t35,
                36,
                "Thai ở 36 tuần tuổi nặng khoảng 2.8 kg, dài khoảng 48 cm. Những lọn tóc của bé dài từ 1.5 – 4cm, đôi khi khiến mẹ cảm thấy ngứa râm ran ở bụng, nhất là mỗi lúc bé cử động. Mọi cơ quan và nội tạng của bé đã hoàn thiện và sẵn sàng chờ ngày chào đời.",
                "Hãy nói chuyện với gia đình và bạn bè, những người vừa mới có em bé gần đây. Nếu họ có những trải nghiệm hay nào đó với bác sĩ nhi của con họ, bạn cũng hãy nói những điều này với bác sĩ của bạn. Nếu bạn có bác sĩ riêng, bạn có quyền yêu cầu để được tự chọn bác sĩ nhi cho con mình.\n" +
                 "Hãy lên danh sách những ai có thể hỗ trợ bạn khi bạn sinh con. Tuy nhiên, cần tránh việc lên kế hoạch quá cụ thể và cứng nhắc. Việc làm này sẽ giúp bạn biết rằng xung quanh mình luôn có những người quan tâm và sẵn sàng hỗ trợ cả về mặt tinh thần lẫn thể chất. Chỉ cần biết như vậy bạn cũng đã cảm thấy khác lắm rồi.\n" +
                "Hãy để bạn đời thử chở bạn đến bệnh viện, để các bạn làm quen với lộ trình, nơi đỗ xe, biết phải làm gì nếu bạn đi sinh ngoài giờ làm việc, và những số điện thoại, thông tin quan trọng của bệnh viện mà bạn cần biết khi đi sinh.\n" +
                 "Hãy sắp xếp ghế ngồi của em bé trên xe của bạn, và nhớ rằng điều quan trọng nhất là sự an toàn của bé. Tránh việc mượn hoặc mua một chiếc ghế đã qua sử dụng trừ phi bạn biết rõ lai lịch của nó. Những dụng cụ bảo đảm an toàn cho bé không phải là những thứ mà bạn có thể xuề xòa về chất lượng\n" +
                ""
            ),
           DataSlide(
               R.drawable.t36,
               37,
                "Bé đang nắm tay rất chặt, các ngón tay khít vào nhau. Đặc biệt khả năng phản xạ rất nhanh, nếu có bất kỳ luồng sáng nào chiếu vào bụng người mẹ, bé sẽ quay mặt đi hướng khác ngay. Cân nặng lúc này đạt 3kg, chiều dài 50cm.",
                "Hãy đến bể bơi đặc biệt khi bạn mang thai vào mùa hè. Bạn sẽ cảm thấy nhẹ nhõm vì nước sẽ nâng đỡ cơ thể bạn. Đừng lo lắng vì vẻ bề ngoài của mình, sẽ không ai để ý đâu. Bơi lội và nổi trên nước là một các thức tuyệt vời để giảm nhiệt độ cơ thể của bạn. \n" +
                  "Đọc nhiều sách, xem phim, gọi điện cho bạn bè và viết một vài bức thư. Hãy tận dụng thời gian của bạn và tận hưởng những việc mà trước đây bạn không có thời gian để làm khi vẫn còn phải đi làm. Nếu mà bạn còn có những đứa con khác thì hãy tìm hiểu những hoạt động mà bạn có thể làm cùng con. Hãy để cho con tham gia vào việc chuẩn bị cho em bé. Hoặc nghĩ đến việc chuẩn bị món quà của em bé cho từng đứa con của bạn. Đây là một cách hiệu quả để thúc đẩy tình cảm anh chị em. Hãy nói chuyện với các con rằng ai sẽ là người trông chúng khi bạn vào viện và nói cho con biết con có thể vào thăm bạn và em bé. Những đứa trẻ được thông báo trước như vậy sẽ cảm thấy chúng có vai trò quan trọng và sẽ thích ứng với sự thay đổi trong gia đình dễ dàng hơn.\n" +
                    "Hãy đến những buổi thăm khám trước khi sinh và biết được khi nào thì bạn không phải đến nữa. Nhiều phụ nữ có mối quan hệ rất thân thiết với y tá hoặc bác sĩ và họ sẽ cảm thấy buồn khi không được gặp bác sĩ hoặc y tá nữa.\n" +
                    "Hãy để cho chồng ngủ ở chỗ khác nếu bạn cần thêm chỗ nằm. Chứng mất ngủ sẽ không được cải thiện nhiều và việc đi vệ sinh thường xuyên vào ban đêm sẽ làm ảnh hưởng đến anh ấy. Nếu bạn có giường riêng thì hãy sắp xếp gối xung quanh, bạn sẽ cảm thấy dễ chịu hơn. Những tiếng động nhỏ từ quạt hay từ đài có thể giúp bạn ngủ dễ hơn. Hãy thử bật nhạc nhẹ nhàng và làm một số động tác thư giãn cơ thể trước khi đi ngủ.\n"
            ),
           DataSlide(
               R.drawable.t37,
               38,
                "Các chất thải đang ngày càng tích lũy trong ruột bé nhiều hơn. Tất cả chờ đến ngay bé chào đời và đi tiêu lần đầu tiên thải ra thành phân su. Cơ quan sinh dục phát triển hoàn chỉnh: tinh hoàn tuột xuống bìu dái (đối với bé trai), môi âm hộ hoàn thiện (đối với bé gái)",
               "Đừng đợi đến phút cuối mới chuẩn bị đồ dùng để đi viện. Việc phải cố gắng tìm các vật dụng cần thiết vào những phút cuối này sẽ tạo ra quá nhiều áp lực không đáng có. Bạn chỉ cần mang ít đồ thôi vì nếu bạn sinh thường thì bạn phải ở lại bệnh viện nhiều nhất là 3 ngày. Hầu hết bà bầu đều mặc quần áo bình thường của họ chứ không mặc đồ ngủ, vì thế hãy chọn những bộ thoải mái, dễ mở ở phía trên nếu bạn định cho con bú.\n" +
                "Nếu bạn không định cho con bú, bạn cần chuẩn bị các vật dụng và công thức riêng. Hãy xác nhận lại với bệnh viện bạn cần sắp xếp những gì có thể để rửa và vệ sinh núm vú cao su cho con bạn.\n" +
                "Nếu bạn cảm thấy quá mệt mỏi khi mang thai rồi và muốn được kích đẻ, hãy nói chuyện với bác sĩ. Lựa chọn này phụ thuộc vào từng người, tuy nhiên rất nhiều yếu tố cần được cân nhắc trước khi quyết định. Hãy lưu ý rằng đối với những trường hợp kích đẻ thì khả năng phải sử dụng đến dụng cụ sẽ cao hơn là chờ đến cơn đau đẻ tự nhiên.\n" +
                "Nếu bạn đã được chỉ định đẻ mổ thì bạn có thể sẽ được gặp bé vào cuối tuần 38 này.\n"

            ),
            DataSlide(
                R.drawable.t38,
                39,
                "Do cân nặng lúc này hơn 3kg nên cơ thể bé đã chiếm hết khoảng trống trong tử cung. Vì vậy mà dây rốn sẽ búi lại thành cục hoặc quấn theo vòng quanh người bé. Các bác sĩ có thể ước lượng được dây rốn lúc này dài khoảng 50cm với độ dày 1.3cm.",
                "Nếu bạn thật sự muốn cố gắng để chuyển dạ tự nhiên, bạn có thể thử vài cách dưới đây. Mặc dù không thể bảo đảm chắc chắn là được, nhưng chúng cũng có thể giúp ích cho bạn.\n" +
                 "Ăn một bữa món Thái với cà ri thật cay, hoặc cố gắng uống một ít dầu hải ly (dầu thầu dầu). Cả hai cách này đều nhằm làm cho ruột co thắt. Quan hệ tình dục cũng được cho là có ích, vì trong tinh dịch nam có chứa chất prostaglandin (hỗn hợp chất béo), có hoạt động tương tự như các kích thích tố nhân tạo có trong gel được sử dụng để giục sinh.\n" +
                    "Nếu có đủ sức thì bạn nên đi bộ nhiều một chút. Đi sẽ giúp tăng áp lực từ đầu em bé lên cổ tử cung, như vậy sẽ giúp cổ tử cung dần mỏng đi và dễ giãn nở.\n" +
                    "Thử kích thích đầu vú nếu bạn có thể chịu đựng được. Một số bà bầu thấy cách này rất hữu ích để giúp tử cung bắt đầu co thắt. Nếu bạn không muốn tự làm điều đó thì có thể nhờ ông xã giúp.\n" +
                    "Không nên làm việc nặng trong tuần này. Sơn nhà, xây tường đá, hoặc bắt đầu sửa nhà – mọi thứ đều phải chờ vào lúc khác.\n"

           ),
            DataSlide(
                R.drawable.t39,
                40,
                "Một số bé phát triển nhanh có thể đạt cân nặng đến 3.6 kg. Đây là thời điểm lý tưởng bé có thể chào đời. Vì sự an toàn của bé, một số bác sĩ có thể yêu cầu mẹ bầu “kích sinh” trong trường hợp bé chưa muốn ra đời. Hãy nhớ rằng thai quá tuần rất dễ gia tăng tổn thương, tăng khả năng nhiễm trùng tử cung đấy nhé!",
                "Nếu bạn rất muốn sinh thường, hãy thử một bữa ăn với cà ri cay và nóng, một cuộc quan hệ tình dục nhiệt tình, hoặc thậm chí một chuyến đi bộ dài. Lúc này thì có lẽ bạn đã sẵn sàng thử bất cứ cách nào để giúp em bé nhanh đến với bạn.\n" +
                "Giữ liên lạc chặt chẽ với bác sĩ của bạn để luôn có được lời khuyên và sự hỗ trợ. Bác sĩ sẽ cho bạn biết về các thủ thuật giục sinh, bao gồm ARM (làm vỡ ối nhân tạo), Gel Prostaglandin (cho gel vào âm đạo), và truyền Syntocinon (truyền chất tổng hợp vào cánh tay).\n" +
                "Hãy tự chúc mừng chính mình vì đã vượt qua thai kỳ dài thành công. Tuy nhiên, đây chỉ mới là bước khởi đầu!\n"

                    )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPref = getSharedPreferences(
            getString(R.string.srf), Context.MODE_PRIVATE)
        val tuanhientai= sharedPref.getInt("tuanhientai",5)
        viewpager.adapter= dataSideAdapters

        viewpager.currentItem= tuanhientai-1
        btnSetting.setOnClickListener {
            val intent: Intent= Intent(this,
                SettingActivity::class.java)
            startActivity(intent)
            finish()
        }
        imgMusic.setOnClickListener {
            startActivity(Intent(this,
                MusicActivity::class.java))
        }

    }


}



