package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Send2: ImageVector
    get() {
        if (_send2 != null) {
            return _send2!!
        }
        _send2 = Builder(name = "Send2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.1104f, 5.96f)
                lineTo(16.1304f, 2.95f)
                curveTo(20.1804f, 1.6f, 22.3804f, 3.81f, 21.0404f, 7.86f)
                lineTo(18.0304f, 16.88f)
                curveTo(16.0104f, 22.95f, 12.6904f, 22.95f, 10.6704f, 16.88f)
                lineTo(9.7804f, 14.2f)
                lineTo(7.1004f, 13.31f)
                curveTo(1.0404f, 11.3f, 1.0404f, 7.99f, 7.1104f, 5.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1191f, 11.6301f)
                lineTo(15.9291f, 7.8101f)
                lineTo(12.1191f, 11.6301f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1205f, 12.38f)
                curveTo(11.9305f, 12.38f, 11.7405f, 12.31f, 11.5905f, 12.16f)
                curveTo(11.3005f, 11.87f, 11.3005f, 11.39f, 11.5905f, 11.1f)
                lineTo(15.3905f, 7.28f)
                curveTo(15.6805f, 6.99f, 16.1605f, 6.99f, 16.4505f, 7.28f)
                curveTo(16.7405f, 7.57f, 16.7405f, 8.05f, 16.4505f, 8.34f)
                lineTo(12.6505f, 12.16f)
                curveTo(12.5005f, 12.3f, 12.3105f, 12.38f, 12.1205f, 12.38f)
                close()
            }
        }
        .build()
        return _send2!!
    }

private var _send2: ImageVector? = null
