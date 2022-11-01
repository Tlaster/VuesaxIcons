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

public val BulkGroup.`Emercoin-(emc)`: ImageVector
    get() {
        if (`_emercoin-(emc)` != null) {
            return `_emercoin-(emc)`!!
        }
        `_emercoin-(emc)` = Builder(name = "Emercoin-(emc)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 7.25f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 7.25f, 6.75f, 7.59f, 6.75f, 8.0f)
                curveTo(6.75f, 8.41f, 7.09f, 8.75f, 7.5f, 8.75f)
                horizontalLineTo(11.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 11.25f, 6.75f, 11.59f, 6.75f, 12.0f)
                curveTo(6.75f, 12.41f, 7.09f, 12.75f, 7.5f, 12.75f)
                horizontalLineTo(12.5f)
                curveTo(12.91f, 12.75f, 13.25f, 12.41f, 13.25f, 12.0f)
                verticalLineTo(8.75f)
                horizontalLineTo(15.75f)
                verticalLineTo(15.25f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 15.25f, 6.75f, 15.59f, 6.75f, 16.0f)
                curveTo(6.75f, 16.41f, 7.09f, 16.75f, 7.5f, 16.75f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 16.75f, 17.25f, 16.41f, 17.25f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(17.25f, 7.59f, 16.91f, 7.25f, 16.5f, 7.25f)
                close()
            }
        }
        .build()
        return `_emercoin-(emc)`!!
    }

private var `_emercoin-(emc)`: ImageVector? = null
