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

public val TwotoneGroup.Heartedit: ImageVector
    get() {
        if (_heartedit != null) {
            return _heartedit!!
        }
        _heartedit = Builder(name = "Heartedit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.49f, 12.0001f)
                curveTo(21.81f, 10.9801f, 22.0f, 9.8801f, 22.0f, 8.6901f)
                curveTo(22.0f, 5.6001f, 19.51f, 3.1001f, 16.44f, 3.1001f)
                curveTo(14.62f, 3.1001f, 13.01f, 3.9801f, 12.0f, 5.3401f)
                curveTo(10.99f, 3.9801f, 9.37f, 3.1001f, 7.56f, 3.1001f)
                curveTo(4.49f, 3.1001f, 2.0f, 5.6001f, 2.0f, 8.6901f)
                curveTo(2.0f, 15.6901f, 8.48f, 19.8201f, 11.38f, 20.8201f)
                curveTo(11.55f, 20.8801f, 11.77f, 20.9101f, 12.0f, 20.9101f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.2091f, 15.74f)
                lineTo(15.6691f, 19.2801f)
                curveTo(15.5291f, 19.4201f, 15.3991f, 19.68f, 15.3691f, 19.87f)
                lineTo(15.1791f, 21.22f)
                curveTo(15.1091f, 21.71f, 15.4491f, 22.05f, 15.9391f, 21.98f)
                lineTo(17.2891f, 21.79f)
                curveTo(17.4791f, 21.76f, 17.7491f, 21.63f, 17.8791f, 21.49f)
                lineTo(21.4191f, 17.95f)
                curveTo(22.0291f, 17.34f, 22.3191f, 16.63f, 21.4191f, 15.73f)
                curveTo(20.5291f, 14.84f, 19.8191f, 15.13f, 19.2091f, 15.74f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.6992f, 16.25f)
                curveTo(18.9992f, 17.33f, 19.8392f, 18.17f, 20.9192f, 18.47f)
            }
        }
        .build()
        return _heartedit!!
    }

private var _heartedit: ImageVector? = null
