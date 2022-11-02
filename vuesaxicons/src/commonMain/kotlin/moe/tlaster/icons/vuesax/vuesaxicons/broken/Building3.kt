package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Building3: ImageVector
    get() {
        if (_building3 != null) {
            return _building3!!
        }
        _building3 = Builder(name = "Building3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.9999f)
                verticalLineTo(7.0699f)
                curveTo(3.0f, 6.3999f, 3.34f, 5.7798f, 3.89f, 5.4098f)
                lineTo(7.89f, 2.7398f)
                curveTo(8.56f, 2.2898f, 9.44f, 2.2898f, 10.11f, 2.7398f)
                lineTo(14.11f, 5.4098f)
                curveTo(14.67f, 5.7798f, 15.0f, 6.3999f, 15.0f, 7.0699f)
                lineTo(15.01f, 21.9898f)
                lineTo(3.01f, 22.0099f)
                lineTo(3.0f, 12.9198f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9805f, 22.01f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(18.9f, 12.0f, 18.0f, 12.9f, 18.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 17.1f, 18.9f, 18.0f, 20.0f, 18.0f)
                curveTo(21.1f, 18.0f, 22.0f, 17.1f, 22.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 12.9f, 21.1f, 12.0f, 20.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                horizontalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                verticalLineTo(18.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 10.5f)
                curveTo(9.8284f, 10.5f, 10.5f, 9.8284f, 10.5f, 9.0f)
                curveTo(10.5f, 8.1716f, 9.8284f, 7.5f, 9.0f, 7.5f)
                curveTo(8.1716f, 7.5f, 7.5f, 8.1716f, 7.5f, 9.0f)
                curveTo(7.5f, 9.8284f, 8.1716f, 10.5f, 9.0f, 10.5f)
                close()
            }
        }
        .build()
        return _building3!!
    }

private var _building3: ImageVector? = null
