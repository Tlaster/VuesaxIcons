package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(15.31f, 19.0f, 18.0f, 16.31f, 18.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 4.69f, 15.31f, 2.0f, 12.0f, 2.0f)
                curveTo(8.69f, 2.0f, 6.0f, 4.69f, 6.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(6.0f, 16.31f, 8.69f, 19.0f, 12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 17.97f, 7.03f, 22.0f, 12.0f, 22.0f)
                curveTo(16.97f, 22.0f, 21.0f, 17.97f, 21.0f, 13.0f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.1101f, 7.4799f)
                curveTo(10.8901f, 6.8299f, 12.8301f, 6.8299f, 14.6101f, 7.4799f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.03f, 10.4799f)
                curveTo(11.23f, 10.1499f, 12.5f, 10.1499f, 13.7f, 10.4799f)
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
