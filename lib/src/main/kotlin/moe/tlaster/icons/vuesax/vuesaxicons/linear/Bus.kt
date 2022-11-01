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

public val LinearGroup.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9f, 22.0f)
                horizontalLineTo(7.1f)
                curveTo(5.4f, 22.0f, 4.0f, 20.61f, 4.0f, 18.9f)
                verticalLineTo(5.1f)
                curveTo(4.0f, 3.4f, 5.39f, 2.0f, 7.1f, 2.0f)
                horizontalLineTo(16.9f)
                curveTo(18.6f, 2.0f, 20.0f, 3.39f, 20.0f, 5.1f)
                verticalLineTo(18.9f)
                curveTo(20.0f, 20.61f, 18.61f, 22.0f, 16.9f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 13.0f)
                horizontalLineTo(5.5f)
                curveTo(4.67f, 13.0f, 4.0f, 12.33f, 4.0f, 11.5f)
                verticalLineTo(9.5f)
                curveTo(4.0f, 8.67f, 4.67f, 8.0f, 5.5f, 8.0f)
                horizontalLineTo(18.5f)
                curveTo(19.33f, 8.0f, 20.0f, 8.67f, 20.0f, 9.5f)
                verticalLineTo(11.5f)
                curveTo(20.0f, 12.33f, 19.33f, 13.0f, 18.5f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.4945f, 17.7f)
                horizontalLineTo(8.5035f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.4945f, 17.7f)
                horizontalLineTo(15.5035f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 5.0f)
                horizontalLineTo(14.5f)
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null
