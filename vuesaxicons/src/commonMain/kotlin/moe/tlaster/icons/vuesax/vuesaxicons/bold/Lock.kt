package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0011f, 17.3498f)
                curveTo(12.9013f, 17.3498f, 13.6311f, 16.6201f, 13.6311f, 15.7198f)
                curveTo(13.6311f, 14.8196f, 12.9013f, 14.0898f, 12.0011f, 14.0898f)
                curveTo(11.1009f, 14.0898f, 10.3711f, 14.8196f, 10.3711f, 15.7198f)
                curveTo(10.3711f, 16.6201f, 11.1009f, 17.3498f, 12.0011f, 17.3498f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.28f, 9.53f)
                verticalLineTo(8.28f)
                curveTo(18.28f, 5.58f, 17.63f, 2.0f, 12.0f, 2.0f)
                curveTo(6.37f, 2.0f, 5.72f, 5.58f, 5.72f, 8.28f)
                verticalLineTo(9.53f)
                curveTo(2.92f, 9.88f, 2.0f, 11.3f, 2.0f, 14.79f)
                verticalLineTo(16.65f)
                curveTo(2.0f, 20.75f, 3.25f, 22.0f, 7.35f, 22.0f)
                horizontalLineTo(16.65f)
                curveTo(20.75f, 22.0f, 22.0f, 20.75f, 22.0f, 16.65f)
                verticalLineTo(14.79f)
                curveTo(22.0f, 11.3f, 21.08f, 9.88f, 18.28f, 9.53f)
                close()
                moveTo(12.0f, 18.74f)
                curveTo(10.33f, 18.74f, 8.98f, 17.38f, 8.98f, 15.72f)
                curveTo(8.98f, 14.05f, 10.34f, 12.7f, 12.0f, 12.7f)
                curveTo(13.66f, 12.7f, 15.02f, 14.06f, 15.02f, 15.72f)
                curveTo(15.02f, 17.39f, 13.67f, 18.74f, 12.0f, 18.74f)
                close()
                moveTo(7.35f, 9.44f)
                curveTo(7.27f, 9.44f, 7.2f, 9.44f, 7.12f, 9.44f)
                verticalLineTo(8.28f)
                curveTo(7.12f, 5.35f, 7.95f, 3.4f, 12.0f, 3.4f)
                curveTo(16.05f, 3.4f, 16.88f, 5.35f, 16.88f, 8.28f)
                verticalLineTo(9.45f)
                curveTo(16.8f, 9.45f, 16.73f, 9.45f, 16.65f, 9.45f)
                horizontalLineTo(7.35f)
                verticalLineTo(9.44f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
