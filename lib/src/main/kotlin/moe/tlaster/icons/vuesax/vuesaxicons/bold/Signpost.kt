package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(name = "Signpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3398f, 14.13f)
                lineTo(16.1598f, 12.38f)
                curveTo(15.8498f, 12.14f, 15.4598f, 12.0f, 15.0598f, 12.0f)
                horizontalLineTo(12.7498f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.2198f)
                curveTo(18.1898f, 9.0f, 18.9698f, 8.22f, 18.9698f, 7.25f)
                verticalLineTo(3.75f)
                curveTo(18.9698f, 2.78f, 18.1898f, 2.0f, 17.2198f, 2.0f)
                horizontalLineTo(8.9598f)
                curveTo(8.5698f, 2.0f, 8.1798f, 2.14f, 7.8698f, 2.38f)
                lineTo(5.6798f, 4.13f)
                curveTo(4.8098f, 4.83f, 4.8098f, 6.17f, 5.6798f, 6.87f)
                lineTo(7.8698f, 8.62f)
                curveTo(8.1798f, 8.86f, 8.5698f, 9.0f, 8.9598f, 9.0f)
                horizontalLineTo(11.2498f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.7998f)
                curveTo(5.8298f, 12.0f, 5.0498f, 12.78f, 5.0498f, 13.75f)
                verticalLineTo(17.25f)
                curveTo(5.0498f, 18.22f, 5.8298f, 19.0f, 6.7998f, 19.0f)
                horizontalLineTo(11.2498f)
                verticalLineTo(21.25f)
                horizontalLineTo(8.9998f)
                curveTo(8.5898f, 21.25f, 8.2498f, 21.59f, 8.2498f, 22.0f)
                curveTo(8.2498f, 22.41f, 8.5898f, 22.75f, 8.9998f, 22.75f)
                horizontalLineTo(14.9998f)
                curveTo(15.4098f, 22.75f, 15.7498f, 22.41f, 15.7498f, 22.0f)
                curveTo(15.7498f, 21.59f, 15.4098f, 21.25f, 14.9998f, 21.25f)
                horizontalLineTo(12.7498f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0598f)
                curveTo(15.4598f, 19.0f, 15.8498f, 18.86f, 16.1598f, 18.62f)
                lineTo(18.3398f, 16.87f)
                curveTo(19.2198f, 16.17f, 19.2198f, 14.83f, 18.3398f, 14.13f)
                close()
            }
        }
        .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null
