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

public val BulkGroup.Cards: ImageVector
    get() {
        if (_cards != null) {
            return _cards!!
        }
        _cards = Builder(name = "Cards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 10.2798f)
                verticalLineTo(17.4298f)
                curveTo(18.97f, 20.2798f, 18.19f, 20.9998f, 15.22f, 20.9998f)
                horizontalLineTo(5.78f)
                curveTo(2.76f, 20.9998f, 2.0f, 20.2498f, 2.0f, 17.2698f)
                verticalLineTo(10.2798f)
                curveTo(2.0f, 7.5798f, 2.63f, 6.7098f, 5.0f, 6.5698f)
                curveTo(5.24f, 6.5598f, 5.5f, 6.5498f, 5.78f, 6.5498f)
                horizontalLineTo(15.22f)
                curveTo(18.24f, 6.5498f, 19.0f, 7.2998f, 19.0f, 10.2798f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.73f)
                verticalLineTo(13.72f)
                curveTo(22.0f, 16.42f, 21.37f, 17.29f, 19.0f, 17.43f)
                verticalLineTo(10.28f)
                curveTo(19.0f, 7.3f, 18.24f, 6.55f, 15.22f, 6.55f)
                horizontalLineTo(5.78f)
                curveTo(5.5f, 6.55f, 5.24f, 6.56f, 5.0f, 6.57f)
                curveTo(5.03f, 3.72f, 5.81f, 3.0f, 8.78f, 3.0f)
                horizontalLineTo(18.22f)
                curveTo(21.24f, 3.0f, 22.0f, 3.75f, 22.0f, 6.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9603f, 18.5601f)
                horizontalLineTo(5.2402f)
                curveTo(4.8302f, 18.5601f, 4.4902f, 18.2201f, 4.4902f, 17.8101f)
                curveTo(4.4902f, 17.4001f, 4.8302f, 17.0601f, 5.2402f, 17.0601f)
                horizontalLineTo(6.9603f)
                curveTo(7.3703f, 17.0601f, 7.7103f, 17.4001f, 7.7103f, 17.8101f)
                curveTo(7.7103f, 18.2201f, 7.3803f, 18.5601f, 6.9603f, 18.5601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5494f, 18.5601f)
                horizontalLineTo(9.1094f)
                curveTo(8.6994f, 18.5601f, 8.3594f, 18.2201f, 8.3594f, 17.8101f)
                curveTo(8.3594f, 17.4001f, 8.6994f, 17.0601f, 9.1094f, 17.0601f)
                horizontalLineTo(12.5494f)
                curveTo(12.9594f, 17.0601f, 13.2994f, 17.4001f, 13.2994f, 17.8101f)
                curveTo(13.2994f, 18.2201f, 12.9694f, 18.5601f, 12.5494f, 18.5601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.8599f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.3599f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.8599f)
                close()
            }
        }
        .build()
        return _cards!!
    }

private var _cards: ImageVector? = null
