package com.example.daniel.festoar;

import android.util.Log;

import java.io.PrintWriter;

public class XMLString {
    private String tag = "DEBUG_ONLY";

    public String createTestXMLString() {
        String xml = new String();
        xml=   "<root>\n" +
                "\t<RobotName>FestoBot</RobotName>\n" +
                "\t<RobotActive>TRUE</RobotActive>\n" +
                "\t<RobotReferenced>TRUE</RobotReferenced>\n" +
                "\t<RobotError>FALSE</RobotError>\n" +
                "\t<RobotOverride>0</RobotOverride>\n" +
                "\t<RefSysName>WorldReference</RefSysName>\n" +
                "\t<Tool>\n" +
                "\t\t<x>1.2</x>\n" +
                "\t\t<y>2.3</y>\n" +
                "\t\t<z>4.5</z>\n" +
                "\t\t<a>5.6</a>\n" +
                "\t\t<b>7.8</b>\n" +
                "\t\t<c>9.0</c>\n" +
                "\t</Tool>\n" +
                "\t<ToolName>Stift</ToolName>\n" +
                "\t<ToolNumber>1</ToolNumber>\n" +
                "\t<AxisCountMain>3</AxisCountMain>\n" +
                "\t<AxisCountWrist>0</AxisCountWrist>\n" +
                "\t<AxisCountAux>0</AxisCountAux>\n" +
                "\t<AxisSimulated>99</AxisSimulated>\n" +
                "\t<AxisReferenced>99</AxisReferenced>\n" +
                "\t<AxisLSN>99</AxisLSN>\n" +
                "\t<AxisLSP>99</AxisLSP>\n" +
                "\t<AxisPos>\n" +
                "\t\t<a1>3.13</a1>\n" +
                "\t\t<a2>7.3</a2>\n" +
                "\t\t<a3>0.24</a3>\n" +
                "\t\t<a4>7.8</a4>\n" +
                "\t\t<a5>3.13</a5>\n" +
                "\t\t<a6>1.0</a6>\n" +
                "\t\t<aux1>0.24</aux1>\n" +
                "\t\t<aux2>7.8</aux2>\n" +
                "\t\t<aux3>7.3</aux3>\n" +
                "\t</AxisPos>\n" +
                "\t<CartPosWorld>\n" +
                "\t\t<x>1.2</x>\n" +
                "\t\t<y>2.3</y>\n" +
                "\t\t<z>4.5</z>\n" +
                "\t\t<a>5.6</a>\n" +
                "\t\t<b>7.8</b>\n" +
                "\t\t<c>9.0</c>\n" +
                "\t\t<aux1>0.24</aux1>\n" +
                "\t\t<aux2>7.8</aux2>\n" +
                "\t\t<aux3>7.3</aux3>\n" +
                "\t</CartPosWorld>\n" +
                "\t<CartPosRefSys>\n" +
                "\t\t<x>1.2</x>\n" +
                "\t\t<y>2.3</y>\n" +
                "\t\t<z>4.5</z>\n" +
                "\t\t<a>5.6</a>\n" +
                "\t\t<b>7.8</b>\n" +
                "\t\t<c>9.0</c>\n" +
                "\t\t<aux1>0.24</aux1>\n" +
                "\t\t<aux2>7.8</aux2>\n" +
                "\t\t<aux3>7.3</aux3>\n" +
                "\t</CartPosRefSys>\n" +
                "\t<AxisDyn>\n" +
                "\t\t<a1>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</a1>\n" +
                "\t\t<a2>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</a2>\n" +
                "\t\t<a3>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</a3>\n" +
                "\t\t<a4>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</a4>\n" +
                "\t\t<a5>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</a5>\n" +
                "\t\t<a6>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</a6>\n" +
                "\t\t<aux1>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</aux1>\n" +
                "\t\t<aux2>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</aux2>\n" +
                "\t\t<aux3>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</aux3>\n" +
                "\t</AxisDyn>\n" +
                "\t<PathDyn>\n" +
                "\t\t<Path>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</Path>\n" +
                "\t\t<Ori>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</Ori>\n" +
                "\t</PathDyn>\n" +
                "\t<CartDyn>\n" +
                "\t\t<x>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</x>\n" +
                "\t\t<y>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</y>\n" +
                "\t\t<z>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</z>\n" +
                "\t\t<a>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</a>\n" +
                "\t\t<b>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</b>\n" +
                "\t\t<c>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</c>\n" +
                "\t\t<aux1>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</aux1>\n" +
                "\t\t<aux2>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</aux2>\n" +
                "\t\t<aux3>\n" +
                "\t\t\t<vel>5.5</vel>\n" +
                "\t\t\t<acc>1.0</acc>\n" +
                "\t\t\t<jerk>2.2</jerk>\n" +
                "\t\t</aux3>\n" +
                "\t</CartDyn>\n" +
                "\t<Error>FALSE</Error>\n" +
                "\t<ErrorId>0</ErrorId>\n" +
                "</root>";
        //Log.i(tag, xml);
        return xml;
    }
}
