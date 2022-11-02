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

public val BulkGroup.Diagram: ImageVector
    get() {
        if (_diagram != null) {
            return _diagram!!
        }
        _diagram = Builder(name = "Diagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.75f)
                horizontalLineTo(5.0f)
                curveTo(2.93f, 22.75f, 1.25f, 21.07f, 1.25f, 19.0f)
                verticalLineTo(2.0f)
                curveTo(1.25f, 1.59f, 1.59f, 1.25f, 2.0f, 1.25f)
                curveTo(2.41f, 1.25f, 2.75f, 1.59f, 2.75f, 2.0f)
                verticalLineTo(19.0f)
                curveTo(2.75f, 20.24f, 3.76f, 21.25f, 5.0f, 21.25f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 21.25f, 22.75f, 21.59f, 22.75f, 22.0f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9998f, 17.7498f)
                curveTo(4.8298f, 17.7498f, 4.6498f, 17.6898f, 4.5098f, 17.5698f)
                curveTo(4.1998f, 17.2998f, 4.1598f, 16.8298f, 4.4298f, 16.5098f)
                lineTo(9.0198f, 11.1498f)
                curveTo(9.5198f, 10.5698f, 10.2398f, 10.2198f, 10.9998f, 10.1898f)
                curveTo(11.7598f, 10.1698f, 12.5098f, 10.4498f, 13.0498f, 10.9898f)
                lineTo(13.9998f, 11.9398f)
                curveTo(14.2498f, 12.1898f, 14.5698f, 12.3098f, 14.9298f, 12.3098f)
                curveTo(15.2798f, 12.2998f, 15.5998f, 12.1398f, 15.8298f, 11.8698f)
                lineTo(20.4198f, 6.5098f)
                curveTo(20.6898f, 6.1998f, 21.1598f, 6.1598f, 21.4798f, 6.4298f)
                curveTo(21.7898f, 6.6998f, 21.8298f, 7.1698f, 21.5598f, 7.4898f)
                lineTo(16.9698f, 12.8498f)
                curveTo(16.4698f, 13.4298f, 15.7498f, 13.7798f, 14.9898f, 13.8098f)
                curveTo(14.2198f, 13.8298f, 13.4798f, 13.5498f, 12.9398f, 13.0098f)
                lineTo(11.9998f, 12.0598f)
                curveTo(11.7498f, 11.8098f, 11.4198f, 11.6798f, 11.0698f, 11.6898f)
                curveTo(10.7198f, 11.6998f, 10.3998f, 11.8598f, 10.1698f, 12.1298f)
                lineTo(5.5798f, 17.4898f)
                curveTo(5.4198f, 17.6598f, 5.2098f, 17.7498f, 4.9998f, 17.7498f)
                close()
            }
        }
        .build()
        return _diagram!!
    }

private var _diagram: ImageVector? = null
