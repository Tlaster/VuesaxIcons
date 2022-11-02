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

public val BulkGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 20.07f)
                verticalLineTo(12.18f)
                curveTo(22.0f, 6.58f, 17.5f, 2.0f, 12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.58f, 2.0f, 12.18f)
                verticalLineTo(20.07f)
                curveTo(2.0f, 21.33f, 2.75f, 21.67f, 3.67f, 20.83f)
                lineTo(4.67f, 19.92f)
                curveTo(5.04f, 19.58f, 5.64f, 19.58f, 6.01f, 19.92f)
                lineTo(8.01f, 21.75f)
                curveTo(8.38f, 22.09f, 8.98f, 22.09f, 9.35f, 21.75f)
                lineTo(11.35f, 19.92f)
                curveTo(11.72f, 19.58f, 12.32f, 19.58f, 12.69f, 19.92f)
                lineTo(14.69f, 21.75f)
                curveTo(15.06f, 22.09f, 15.66f, 22.09f, 16.03f, 21.75f)
                lineTo(18.03f, 19.92f)
                curveTo(18.4f, 19.58f, 19.0f, 19.58f, 19.37f, 19.92f)
                lineTo(20.37f, 20.83f)
                curveTo(21.25f, 21.67f, 22.0f, 21.33f, 22.0f, 20.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0003f, 16.07f)
                curveTo(10.4303f, 16.07f, 8.8603f, 15.58f, 7.5503f, 14.6f)
                curveTo(7.2203f, 14.35f, 7.1503f, 13.88f, 7.4003f, 13.55f)
                curveTo(7.6503f, 13.22f, 8.1203f, 13.15f, 8.4503f, 13.4f)
                curveTo(10.5403f, 14.97f, 13.4602f, 14.97f, 15.5502f, 13.4f)
                curveTo(15.8802f, 13.15f, 16.3502f, 13.22f, 16.6002f, 13.55f)
                curveTo(16.8502f, 13.88f, 16.7803f, 14.35f, 16.4503f, 14.6f)
                curveTo(15.1403f, 15.58f, 13.5703f, 16.07f, 12.0003f, 16.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9991f, 11.3801f)
                curveTo(13.3136f, 11.3801f, 14.3792f, 10.3146f, 14.3792f, 9.0001f)
                curveTo(14.3792f, 7.6857f, 13.3136f, 6.6201f, 11.9991f, 6.6201f)
                curveTo(10.6847f, 6.6201f, 9.6191f, 7.6857f, 9.6191f, 9.0001f)
                curveTo(9.6191f, 10.3146f, 10.6847f, 11.3801f, 11.9991f, 11.3801f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
