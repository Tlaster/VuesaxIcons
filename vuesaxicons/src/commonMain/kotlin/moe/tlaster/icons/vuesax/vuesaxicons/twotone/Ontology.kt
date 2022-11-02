package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Ontology: ImageVector
    get() {
        if (_ontology != null) {
            return _ontology!!
        }
        _ontology = Builder(name = "Ontology", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8997f, 19.68f)
                curveTo(16.1797f, 21.18f, 13.9097f, 22.07f, 11.4197f, 22.0f)
                curveTo(6.2497f, 21.86f, 2.2197f, 17.41f, 2.2197f, 12.24f)
                verticalLineTo(5.21f)
                curveTo(2.2197f, 4.76f, 2.7597f, 4.54f, 3.0697f, 4.86f)
                lineTo(17.8997f, 19.68f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.2197f, 4.3f)
                curveTo(7.9297f, 2.81f, 10.1797f, 1.93f, 12.6497f, 2.0f)
                curveTo(17.7797f, 2.14f, 21.7697f, 6.55f, 21.7697f, 11.68f)
                verticalLineTo(18.64f)
                curveTo(21.7697f, 19.09f, 21.2297f, 19.31f, 20.9197f, 18.99f)
                lineTo(6.2197f, 4.3f)
                close()
            }
        }
        .build()
        return _ontology!!
    }

private var _ontology: ImageVector? = null
