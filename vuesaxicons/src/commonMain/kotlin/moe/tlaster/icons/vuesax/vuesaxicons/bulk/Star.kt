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

public val BulkGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3909f, 5.21f)
                lineTo(16.8009f, 8.03f)
                curveTo(16.9909f, 8.42f, 17.5009f, 8.79f, 17.9309f, 8.87f)
                lineTo(20.4809f, 9.29f)
                curveTo(22.1109f, 9.56f, 22.4909f, 10.74f, 21.3209f, 11.92f)
                lineTo(19.3309f, 13.91f)
                curveTo(19.0009f, 14.24f, 18.8109f, 14.89f, 18.9209f, 15.36f)
                lineTo(19.4909f, 17.82f)
                curveTo(19.9409f, 19.76f, 18.9009f, 20.52f, 17.1909f, 19.5f)
                lineTo(14.8009f, 18.08f)
                curveTo(14.3709f, 17.82f, 13.6509f, 17.82f, 13.2209f, 18.08f)
                lineTo(10.8309f, 19.5f)
                curveTo(9.1209f, 20.51f, 8.0809f, 19.76f, 8.5309f, 17.82f)
                lineTo(9.1009f, 15.36f)
                curveTo(9.2109f, 14.9f, 9.0209f, 14.25f, 8.6909f, 13.91f)
                lineTo(6.7009f, 11.92f)
                curveTo(5.5309f, 10.75f, 5.9109f, 9.57f, 7.5409f, 9.29f)
                lineTo(10.0909f, 8.87f)
                curveTo(10.5209f, 8.8f, 11.0309f, 8.42f, 11.2209f, 8.03f)
                lineTo(12.6309f, 5.21f)
                curveTo(13.3809f, 3.68f, 14.6209f, 3.68f, 15.3909f, 5.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 5.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 5.75f, 1.25f, 5.41f, 1.25f, 5.0f)
                curveTo(1.25f, 4.59f, 1.59f, 4.25f, 2.0f, 4.25f)
                horizontalLineTo(8.0f)
                curveTo(8.41f, 4.25f, 8.75f, 4.59f, 8.75f, 5.0f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8.0f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 19.75f, 1.25f, 19.41f, 1.25f, 19.0f)
                curveTo(1.25f, 18.59f, 1.59f, 18.25f, 2.0f, 18.25f)
                horizontalLineTo(5.0f)
                curveTo(5.41f, 18.25f, 5.75f, 18.59f, 5.75f, 19.0f)
                curveTo(5.75f, 19.41f, 5.41f, 19.75f, 5.0f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12.0f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(3.0f)
                curveTo(3.41f, 11.25f, 3.75f, 11.59f, 3.75f, 12.0f)
                curveTo(3.75f, 12.41f, 3.41f, 12.75f, 3.0f, 12.75f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
