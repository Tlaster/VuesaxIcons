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

public val BoldGroup.Lockcircle: ImageVector
    get() {
        if (_lockcircle != null) {
            return _lockcircle!!
        }
        _lockcircle = Builder(name = "Lockcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.75f)
                curveTo(10.11f, 7.75f, 9.75f, 8.54f, 9.75f, 10.0f)
                verticalLineTo(10.62f)
                horizontalLineTo(14.25f)
                verticalLineTo(10.0f)
                curveTo(14.25f, 8.54f, 13.89f, 7.75f, 12.0f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9984f, 15.0984f)
                curveTo(12.606f, 15.0984f, 13.0984f, 14.606f, 13.0984f, 13.9984f)
                curveTo(13.0984f, 13.3909f, 12.606f, 12.8984f, 11.9984f, 12.8984f)
                curveTo(11.3909f, 12.8984f, 10.8984f, 13.3909f, 10.8984f, 13.9984f)
                curveTo(10.8984f, 14.606f, 11.3909f, 15.0984f, 11.9984f, 15.0984f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.38f, 14.5f)
                curveTo(17.38f, 16.7f, 16.7f, 17.38f, 14.5f, 17.38f)
                horizontalLineTo(9.5f)
                curveTo(7.3f, 17.38f, 6.62f, 16.7f, 6.62f, 14.5f)
                verticalLineTo(13.5f)
                curveTo(6.62f, 11.79f, 7.03f, 11.0f, 8.25f, 10.73f)
                verticalLineTo(10.0f)
                curveTo(8.25f, 9.07f, 8.25f, 6.25f, 12.0f, 6.25f)
                curveTo(15.75f, 6.25f, 15.75f, 9.07f, 15.75f, 10.0f)
                verticalLineTo(10.73f)
                curveTo(16.97f, 11.0f, 17.38f, 11.79f, 17.38f, 13.5f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _lockcircle!!
    }

private var _lockcircle: ImageVector? = null
