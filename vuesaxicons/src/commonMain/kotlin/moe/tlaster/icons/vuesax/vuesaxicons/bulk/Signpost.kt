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

public val BulkGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(name = "Signpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9698f, 3.75f)
                verticalLineTo(7.25f)
                curveTo(18.9698f, 8.22f, 18.1898f, 9.0f, 17.2198f, 9.0f)
                horizontalLineTo(8.9599f)
                curveTo(8.5699f, 9.0f, 8.1798f, 8.86f, 7.8699f, 8.62f)
                lineTo(5.6798f, 6.87f)
                curveTo(4.8098f, 6.17f, 4.8098f, 4.83f, 5.6798f, 4.13f)
                lineTo(7.8699f, 2.38f)
                curveTo(8.1798f, 2.14f, 8.5699f, 2.0f, 8.9599f, 2.0f)
                horizontalLineTo(17.2198f)
                curveTo(18.1898f, 2.0f, 18.9698f, 2.78f, 18.9698f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3408f, 16.87f)
                lineTo(16.1608f, 18.62f)
                curveTo(15.8508f, 18.86f, 15.4608f, 19.0f, 15.0608f, 19.0f)
                horizontalLineTo(6.8008f)
                curveTo(5.8308f, 19.0f, 5.0508f, 18.22f, 5.0508f, 17.25f)
                verticalLineTo(13.75f)
                curveTo(5.0508f, 12.78f, 5.8308f, 12.0f, 6.8008f, 12.0f)
                horizontalLineTo(15.0608f)
                curveTo(15.4608f, 12.0f, 15.8508f, 12.14f, 16.1608f, 12.38f)
                lineTo(18.3408f, 14.13f)
                curveTo(19.2208f, 14.83f, 19.2208f, 16.17f, 18.3408f, 16.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 9.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 22.0f)
                curveTo(15.75f, 22.41f, 15.41f, 22.75f, 15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(8.59f, 22.75f, 8.25f, 22.41f, 8.25f, 22.0f)
                curveTo(8.25f, 21.59f, 8.59f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.25f)
                horizontalLineTo(15.0f)
                curveTo(15.41f, 21.25f, 15.75f, 21.59f, 15.75f, 22.0f)
                close()
            }
        }
        .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null
