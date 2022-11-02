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

public val BrokenGroup.Milk: ImageVector
    get() {
        if (_milk != null) {
            return _milk!!
        }
        _milk = Builder(name = "Milk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 13.98f)
                lineTo(9.89f, 14.0f)
                curveTo(10.62f, 14.0f, 11.34f, 14.17f, 12.0f, 14.5f)
                curveTo(12.66f, 14.83f, 13.38f, 15.0f, 14.12f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 20.65f, 16.65f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(7.35f, 22.0f, 6.0f, 20.65f, 6.0f, 19.0f)
                verticalLineTo(17.99f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 10.83f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.12f)
                curveTo(13.38f, 15.0f, 12.66f, 14.83f, 12.0f, 14.5f)
                curveTo(11.34f, 14.17f, 10.62f, 14.0f, 9.89f, 14.0f)
                lineTo(6.0f, 13.98f)
                verticalLineTo(10.83f)
                curveTo(6.0f, 10.37f, 6.26f, 9.74f, 6.59f, 9.41f)
                lineTo(8.71f, 7.29f)
                curveTo(8.89f, 7.11f, 9.0f, 6.85f, 9.0f, 6.59f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.59f)
                curveTo(15.0f, 6.85f, 15.11f, 7.11f, 15.29f, 7.29f)
                lineTo(17.41f, 9.41f)
                curveTo(17.74f, 9.74f, 18.0f, 10.37f, 18.0f, 10.83f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 16.0f)
                verticalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 5.0f)
                horizontalLineTo(9.5f)
                curveTo(8.67f, 5.0f, 8.0f, 4.32f, 8.0f, 3.5f)
                curveTo(8.0f, 2.68f, 8.67f, 2.0f, 9.5f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(15.33f, 2.0f, 16.0f, 2.68f, 16.0f, 3.5f)
                curveTo(16.0f, 4.32f, 15.33f, 5.0f, 14.5f, 5.0f)
                close()
            }
        }
        .build()
        return _milk!!
    }

private var _milk: ImageVector? = null
