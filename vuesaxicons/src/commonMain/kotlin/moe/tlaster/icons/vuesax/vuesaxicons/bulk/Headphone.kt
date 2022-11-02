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

public val BulkGroup.Headphone: ImageVector
    get() {
        if (_headphone != null) {
            return _headphone!!
        }
        _headphone = Builder(name = "Headphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.7498f, 18.65f)
                curveTo(2.3398f, 18.65f, 1.9998f, 18.31f, 1.9998f, 17.9f)
                verticalLineTo(12.2f)
                curveTo(1.9498f, 9.4901f, 2.9598f, 6.93f, 4.8398f, 5.01f)
                curveTo(6.7198f, 3.1f, 9.2398f, 2.0501f, 11.9498f, 2.0501f)
                curveTo(17.4898f, 2.0501f, 21.9998f, 6.5601f, 21.9998f, 12.1f)
                verticalLineTo(17.8f)
                curveTo(21.9998f, 18.21f, 21.6598f, 18.55f, 21.2498f, 18.55f)
                curveTo(20.8398f, 18.55f, 20.4998f, 18.21f, 20.4998f, 17.8f)
                verticalLineTo(12.1f)
                curveTo(20.4998f, 7.39f, 16.6698f, 3.5501f, 11.9498f, 3.5501f)
                curveTo(9.6398f, 3.5501f, 7.4998f, 4.4401f, 5.9098f, 6.0601f)
                curveTo(4.3098f, 7.6901f, 3.4598f, 9.8601f, 3.4998f, 12.18f)
                verticalLineTo(17.89f)
                curveTo(3.4998f, 18.31f, 3.1698f, 18.65f, 2.7498f, 18.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.94f, 12.45f)
                horizontalLineTo(5.81f)
                curveTo(3.71f, 12.45f, 2.0f, 14.16f, 2.0f, 16.26f)
                verticalLineTo(18.14f)
                curveTo(2.0f, 20.24f, 3.71f, 21.95f, 5.81f, 21.95f)
                horizontalLineTo(5.94f)
                curveTo(8.04f, 21.95f, 9.75f, 20.24f, 9.75f, 18.14f)
                verticalLineTo(16.26f)
                curveTo(9.75f, 14.16f, 8.04f, 12.45f, 5.94f, 12.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.19f, 12.45f)
                horizontalLineTo(18.06f)
                curveTo(15.96f, 12.45f, 14.25f, 14.16f, 14.25f, 16.26f)
                verticalLineTo(18.14f)
                curveTo(14.25f, 20.24f, 15.96f, 21.95f, 18.06f, 21.95f)
                horizontalLineTo(18.19f)
                curveTo(20.29f, 21.95f, 22.0f, 20.24f, 22.0f, 18.14f)
                verticalLineTo(16.26f)
                curveTo(22.0f, 14.16f, 20.29f, 12.45f, 18.19f, 12.45f)
                close()
            }
        }
        .build()
        return _headphone!!
    }

private var _headphone: ImageVector? = null
