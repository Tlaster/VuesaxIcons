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

public val BulkGroup.Flag2: ImageVector
    get() {
        if (_flag2 != null) {
            return _flag2!!
        }
        _flag2 = Builder(name = "Flag2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4492f, 22.0f)
                curveTo(6.0392f, 22.0f, 5.6992f, 21.66f, 5.6992f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(5.6992f, 2.34f, 6.0392f, 2.0f, 6.4492f, 2.0f)
                curveTo(6.8592f, 2.0f, 7.1992f, 2.34f, 7.1992f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(7.1992f, 21.66f, 6.8592f, 22.0f, 6.4492f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.2001f, 7.16f)
                lineTo(7.1001f, 3.66f)
                curveTo(6.9801f, 3.6f, 6.8501f, 3.62f, 6.7401f, 3.69f)
                curveTo(6.6401f, 3.76f, 6.5801f, 3.87f, 6.5801f, 4.0f)
                verticalLineTo(17.0f)
                curveTo(6.5801f, 17.13f, 6.6501f, 17.25f, 6.7601f, 17.32f)
                curveTo(6.8201f, 17.36f, 6.8901f, 17.38f, 6.9601f, 17.38f)
                curveTo(7.0201f, 17.38f, 7.0701f, 17.37f, 7.1301f, 17.34f)
                lineTo(15.4301f, 13.24f)
                curveTo(15.4301f, 13.24f, 15.4301f, 13.24f, 15.4401f, 13.24f)
                curveTo(17.1001f, 12.38f, 17.9901f, 11.27f, 17.9401f, 10.1f)
                curveTo(17.8801f, 8.92f, 16.9101f, 7.88f, 15.2001f, 7.16f)
                close()
            }
        }
        .build()
        return _flag2!!
    }

private var _flag2: ImageVector? = null
