package com.company;

public class story extends Exception {
    public story(String msg) {
        super(msg);
    }
}

class shortstorywrite {
    public static void read(int num) throws story {
        if (num > 1500) {
            throw new story("这只是个短篇故事");
        } else {
            System.out.println("    吕洞宾成仙得道之前，原是个读书人。他的好友中有个同乡叫苟杳。苟杳父母双亡，家境贫寒，但为人忠厚，是一个老诚君子，读书又很勤奋。\n吕洞宾很赏识他，与他结拜为金兰兄弟，并请他到自己家中居住，希望他能刻苦读书，以后能有个出头之日。 \n" +

                    "　　一天，吕洞宾家来了一位姓林的客人，见苟杳一表人材，读书用功，便对吕洞宾说，想把妹妹许配给苟杳。吕洞宾深怕苟杳贪恋床第之欢误了\n锦绣前程，连忙推托。没料到，苟杳本人听说林家小姐貌美，执意要应允这门亲事。吕洞宾思索良久同意了。他对苛杳说：“贤弟既然主意已定，\n我不阻拦，不过成亲之后，我要先陪新娘子睡三宿。”苟杳听了大吃一惊。寄人篱下，怎得不低头?再说，婚礼的一切花费都得仰仗吕家，谁让自\n己一贫如洗呢?思前想后，还是咬咬牙答应了。 \n" +

                    "　　苟杳成亲这天，吕洞宾喜气洋洋，跑前跑后张罗一切。而苟杳却无脸见人，干脆躲到一边。到了晚上，送走了宾客，吕洞宾进了洞房。只见新\n娘子头盖红纱，倚床而坐。吕洞宾不去掀那红盖头，也不说话，只管坐在灯下埋头读书。林小姐等到半夜，丈夫还是不上床，只好自己和衣睡下了。\n天明醒来，丈夫早已不见。一连三夜都是这样，可苦坏了林小姐，回头再说苟杳，好不容易熬过了三天，刚进洞房，见娘子正伤心落泪，低头哭着\n说：“郎君为何一连三夜都不上床同眠，只顾对灯读书，天黑而来，天明而去?”这一问，问得苟杳目瞪口呆。新娘子抬起头来一看，更是惊诧莫名：\n怎么丈夫换了个人?半天，夫妻俩才恍然大悟。苟杳双脚一跺，仰天大笑：“原来哥哥怕我贪欢，忘了读书，用此法来激励我啊!”林小姐也是心中欢\n喜，对吕洞宾充满了敬意。夫妻俩都说：吕兄此恩，将来一定要报答。 \n" +

                    "　　几年后，苟杳果然金榜题名，做了大官。夫妻俩与吕洞宾一家洒泪而别，赴任而去，一晃八年过去了。这年夏天，吕家不慎失火，偌大一份家\n财化灰烬。吕洞宾和妻子只好在残砖破瓦搭就的茅屋里寄身，不用说，日子过得是够难的。吕洞宾只好出门去找苟杳帮忙。一路上历尽千辛万苦，终\n于找上了苟杳府。苟杳对吕洞宾家遭大火非常同情，热情接待了他，可就是不提帮忙的事。吕洞宾一住几个月，一点银子也没拿到。吕洞宾仰天长\n叹：“人情薄如纸，一阔脸就变，滔滔然天下皆是也!”一气之下，不辞而别。 \n" +

                    "　　回到家乡，吕洞宾老远就见自家的破茅屋换成了新瓦房，大为诧异：自己远离，子幼妻弱，怎能大兴土木?及至走近家门，更是惊得三魂走了两\n魄：大门两旁竟贴了白纸。家里死了人?他慌忙进屋，见屋里停着一口棺材，妻子披麻戴孝，正在嚎陶大哭。吕洞宾愣了半天：她为哪个戴孝?轻轻叫\n一声：“娘子。”娘子回头一看，惊恐万状，颤颤抖抖地叫道：“你，你是人还是鬼?”吕洞宾更觉诧异：“娘子怎出此言?我好好地回来了，如何是鬼?”\n娘子端详了半天，才敢相信真是吕洞宾回来了，说：“哎呀！当真吓死我了!这不会是在梦中吧?”原来，吕洞宾离家不久，就有一帮人来帮他盖房子，\n盖完了房子就走了。前天中午，又有一帮人抬来一口棺材，说是吕洞宾在苟杳家病死了。妻子一听，天塌地陷，哭得死去活来。今天正哭着，不想\n吕洞宾竟回来了。 \n" +

                    "　　吕洞宾心下明白：都是苟杳玩的把戏。他操起一把利斧，狠劈棺材。“咔嚓”一声，棺材劈开了，里面竟全是金银财宝，还有一封信。吕洞宾展\n开信读道：“苟杳不是负心郎，路送金银家盖房。你让我妻守空房，我让你妻哭断肠。”吕洞宾如梦初醒，苦笑一声：“贤弟，你这一帮，可帮得我好苦啊!” \n" +

                    "　　从此，吕苟两家倍加亲热。这就是俗话常说的“苟杳吕洞宾，不识好人心”，因为“苟杳”与“狗咬”同音，传来传去竟成了“狗咬吕洞宾，不识好人心”。");
        }
    }
}
