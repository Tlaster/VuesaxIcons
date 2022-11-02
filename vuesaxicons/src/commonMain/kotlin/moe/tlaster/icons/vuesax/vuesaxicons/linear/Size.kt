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

public val LinearGroup.Size: ImageVector
    get() {
        if (_size != null) {
            return _size!!
        }
        _size = Builder(name = "Size", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.97f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(16.97f, 20.5f, 15.47f, 22.0f, 11.72f, 22.0f)
                horizontalLineTo(7.22f)
                curveTo(3.47f, 22.0f, 1.97f, 20.5f, 1.97f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(1.97f, 8.5f, 3.47f, 7.0f, 7.22f, 7.0f)
                horizontalLineTo(11.72f)
                curveTo(15.47f, 7.0f, 16.97f, 8.5f, 16.97f, 12.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 5.85f)
                verticalLineTo(9.15f)
                curveTo(21.97f, 11.9f, 20.87f, 13.0f, 18.12f, 13.0f)
                horizontalLineTo(16.97f)
                verticalLineTo(12.25f)
                curveTo(16.97f, 8.5f, 15.47f, 7.0f, 11.72f, 7.0f)
                horizontalLineTo(10.97f)
                verticalLineTo(5.85f)
                curveTo(10.97f, 3.1f, 12.07f, 2.0f, 14.82f, 2.0f)
                horizontalLineTo(18.12f)
                curveTo(20.87f, 2.0f, 21.97f, 3.1f, 21.97f, 5.85f)
                close()
            }
        }
        .build()
        return _size!!
    }

private var _size: ImageVector? = null
