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

public val BulkGroup.Cd: ImageVector
    get() {
        if (_cd != null) {
            return _cd!!
        }
        _cd = Builder(name = "Cd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 20.0f)
                curveTo(15.5228f, 20.0f, 20.0f, 15.5228f, 20.0f, 10.0f)
                curveTo(20.0f, 4.4771f, 15.5228f, 0.0f, 10.0f, 0.0f)
                curveTo(4.4771f, 0.0f, 0.0f, 4.4771f, 0.0f, 10.0f)
                curveTo(0.0f, 15.5228f, 4.4771f, 20.0f, 10.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.5f)
                curveTo(11.3807f, 12.5f, 12.5f, 11.3807f, 12.5f, 10.0f)
                curveTo(12.5f, 8.6193f, 11.3807f, 7.5f, 10.0f, 7.5f)
                curveTo(8.6193f, 7.5f, 7.5f, 8.6193f, 7.5f, 10.0f)
                curveTo(7.5f, 11.3807f, 8.6193f, 12.5f, 10.0f, 12.5f)
                close()
            }
        }
        .build()
        return _cd!!
    }

private var _cd: ImageVector? = null
