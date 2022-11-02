package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Pausecircle: ImageVector
    get() {
        if (_pausecircle != null) {
            return _pausecircle!!
        }
        _pausecircle = Builder(name = "Pausecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9707f, 22.75f)
                curveTo(6.0507f, 22.75f, 1.2207f, 17.93f, 1.2207f, 12.0f)
                curveTo(1.2207f, 6.07f, 6.0507f, 1.25f, 11.9707f, 1.25f)
                curveTo(17.8907f, 1.25f, 22.7207f, 6.07f, 22.7207f, 12.0f)
                curveTo(22.7207f, 17.93f, 17.9007f, 22.75f, 11.9707f, 22.75f)
                close()
                moveTo(11.9707f, 2.75f)
                curveTo(6.8707f, 2.75f, 2.7207f, 6.9f, 2.7207f, 12.0f)
                curveTo(2.7207f, 17.1f, 6.8707f, 21.25f, 11.9707f, 21.25f)
                curveTo(17.0707f, 21.25f, 21.2207f, 17.1f, 21.2207f, 12.0f)
                curveTo(21.2207f, 6.9f, 17.0707f, 2.75f, 11.9707f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.01f, 15.9498f)
                horizontalLineTo(8.71f)
                curveTo(7.79f, 15.9498f, 7.25f, 15.4198f, 7.25f, 14.5298f)
                verticalLineTo(9.4698f)
                curveTo(7.25f, 8.5798f, 7.8f, 8.0498f, 8.71f, 8.0498f)
                horizontalLineTo(10.0f)
                curveTo(10.92f, 8.0498f, 11.46f, 8.5798f, 11.46f, 9.4698f)
                verticalLineTo(14.5298f)
                curveTo(11.47f, 15.4198f, 10.92f, 15.9498f, 10.01f, 15.9498f)
                close()
                moveTo(8.75f, 14.4498f)
                horizontalLineTo(9.97f)
                verticalLineTo(9.5498f)
                horizontalLineTo(8.76f)
                lineTo(8.75f, 14.4498f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2891f, 15.9498f)
                horizontalLineTo(13.9991f)
                curveTo(13.0791f, 15.9498f, 12.5391f, 15.4198f, 12.5391f, 14.5298f)
                verticalLineTo(9.4698f)
                curveTo(12.5391f, 8.5798f, 13.0891f, 8.0498f, 13.9991f, 8.0498f)
                horizontalLineTo(15.2891f)
                curveTo(16.2091f, 8.0498f, 16.7491f, 8.5798f, 16.7491f, 9.4698f)
                verticalLineTo(14.5298f)
                curveTo(16.7491f, 15.4198f, 16.1991f, 15.9498f, 15.2891f, 15.9498f)
                close()
                moveTo(14.0291f, 14.4498f)
                horizontalLineTo(15.2491f)
                verticalLineTo(9.5498f)
                horizontalLineTo(14.0391f)
                lineTo(14.0291f, 14.4498f)
                close()
            }
        }
        .build()
        return _pausecircle!!
    }

private var _pausecircle: ImageVector? = null
