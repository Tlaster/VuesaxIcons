package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.2802f, 21.9998f)
                curveTo(8.0033f, 21.9998f, 9.4002f, 20.6029f, 9.4002f, 18.8798f)
                curveTo(9.4002f, 17.1566f, 8.0033f, 15.7598f, 6.2802f, 15.7598f)
                curveTo(4.557f, 15.7598f, 3.1602f, 17.1566f, 3.1602f, 18.8798f)
                curveTo(3.1602f, 20.6029f, 4.557f, 21.9998f, 6.2802f, 21.9998f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.7196f, 19.9202f)
                curveTo(19.4427f, 19.9202f, 20.8396f, 18.5233f, 20.8396f, 16.8002f)
                curveTo(20.8396f, 15.077f, 19.4427f, 13.6802f, 17.7196f, 13.6802f)
                curveTo(15.9965f, 13.6802f, 14.5996f, 15.077f, 14.5996f, 16.8002f)
                curveTo(14.5996f, 18.5233f, 15.9965f, 19.9202f, 17.7196f, 19.9202f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8404f, 16.8003f)
                verticalLineTo(4.6003f)
                curveTo(20.8404f, 2.0003f, 19.2104f, 1.6403f, 17.5604f, 2.0903f)
                lineTo(11.3204f, 3.7903f)
                curveTo(10.1804f, 4.1003f, 9.4004f, 5.0003f, 9.4004f, 6.3003f)
                verticalLineTo(8.4703f)
                verticalLineTo(9.9303f)
                verticalLineTo(18.8703f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4004f, 9.5204f)
                lineTo(20.8404f, 6.4004f)
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
