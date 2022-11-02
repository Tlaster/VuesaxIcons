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

public val BulkGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5904f, 7.41f)
                lineTo(6.3104f, 17.69f)
                curveTo(5.8304f, 18.17f, 5.0104f, 18.06f, 4.7204f, 17.45f)
                curveTo(4.2004f, 16.38f, 3.9004f, 15.17f, 3.9004f, 13.9f)
                curveTo(3.8804f, 8.38f, 9.4804f, 3.66f, 11.3804f, 2.21f)
                curveTo(11.7504f, 1.93f, 12.2504f, 1.93f, 12.6104f, 2.21f)
                curveTo(13.4804f, 2.87f, 15.1104f, 4.24f, 16.6404f, 6.04f)
                curveTo(16.9804f, 6.44f, 16.9604f, 7.04f, 16.5904f, 7.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.1f, 13.91f)
                curveTo(20.1f, 18.37f, 16.47f, 22.0f, 12.0f, 22.0f)
                curveTo(10.21f, 22.0f, 8.54f, 21.42f, 7.19f, 20.42f)
                curveTo(6.7f, 20.06f, 6.66f, 19.34f, 7.09f, 18.91f)
                lineTo(17.16f, 8.84f)
                curveTo(17.63f, 8.37f, 18.42f, 8.47f, 18.74f, 9.05f)
                curveTo(19.56f, 10.56f, 20.11f, 12.2f, 20.1f, 13.91f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null
