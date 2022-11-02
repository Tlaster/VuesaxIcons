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

public val TwotoneGroup.Attachcircle: ImageVector
    get() {
        if (_attachcircle != null) {
            return _attachcircle!!
        }
        _attachcircle = Builder(name = "Attachcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2009f, 11.8002f)
                lineTo(10.7908f, 13.2102f)
                curveTo(10.0108f, 13.9902f, 10.0108f, 15.2602f, 10.7908f, 16.0402f)
                curveTo(11.5708f, 16.8202f, 12.8408f, 16.8202f, 13.6208f, 16.0402f)
                lineTo(15.8409f, 13.8202f)
                curveTo(17.4009f, 12.2602f, 17.4009f, 9.7302f, 15.8409f, 8.1602f)
                curveTo(14.2809f, 6.6002f, 11.7508f, 6.6002f, 10.1808f, 8.1602f)
                lineTo(7.7609f, 10.5802f)
                curveTo(6.4209f, 11.9202f, 6.4209f, 14.0902f, 7.7609f, 15.4302f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _attachcircle!!
    }

private var _attachcircle: ImageVector? = null
